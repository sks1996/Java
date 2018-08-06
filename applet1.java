// Create a child frame window from within an applet.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
// Create a subclass of Frame.
class SampleFrame extends Frame {
SampleFrame(String title) {
super(title);
// create an object to handle window events
MyWindowAdapter adapter = new MyWindowAdapter(this);
// register it to receive those events
addWindowListener(adapter);
}
@Override
public void paint(Graphics g) {
g.drawString("This is in frame window", 10, 40);
}
}
class MyWindowAdapter extends WindowAdapter {
SampleFrame sampleFrame;
public MyWindowAdapter(SampleFrame sampleFrame) {
this.sampleFrame = sampleFrame;
}
@Override
public void windowClosing(WindowEvent we) {
sampleFrame.setVisible(false);
}
}
// Create frame window.
public class applet1 extends Applet {
Frame f;
@Override
public void init() 
{
f = new SampleFrame("A Frame Window");
f.setSize(150, 150);
f.setVisible(true);
}
@Override
public void start() {
f.setVisible(true);
}
@Override
public void stop() {
f.setVisible(false);
}
@Override
public void paint(Graphics g) {
g.drawString("This is in applet window", 15, 30);
}

}