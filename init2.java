import java.awt.FlowLayout;//defalut layout
import javax.swing.JFrame;//all basic windows feature
import javax.swing.JLabel;//text and images on the screen
class sks extends JFrame
{
JLabel item1;
sks()
{
super("the title bar");//gives title to ur windows
setLayout(new FlowLayout());//defalut layout
item1 =new JLabel("this is a sentence");
item1.setToolTipText("this is gona show us hover");
add(item1);
}
}
class init2
{
public static void main (String args[])
{
sks s =new sks();
s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
s.setSize(200,400);
s.setVisible(true);
}
}
