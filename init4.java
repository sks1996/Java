import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
class dba extends JFrame
{
JTextField item1;
JTextField item2;
JTextField item3;
JPasswordField passward;
dba()
{
super("the title bar");
setLayout(new FlowLayout());
item1 =new JTextField("hello");
String s=item1 .getText();
//double initialvelocity = Double.parseDouble(s);
double value = Double.parseDouble(JOptionPane.showInputDialog(s)); 
add(item1);
item2 =new JTextField("enter text here");
add(item2);
item3 =new JTextField("uneditable",20);
item3.setEditable(false);
add(item3);
passward=new JPasswordField("my passwd");
add(passward);

thehandler h =new thehandler();
item1.addActionListener(h);
item2.addActionListener(h);
item3.addActionListener(h);
passward.addActionListener(h);
}
}

class thehandler extends dba implements ActionListener
{ 
   void ActionPerformed(ActionEvent e)
{
String s=" ";
if(e.getSource()==item1)
s=String.format("the field is %s", e.getActionCommand());

else if(e.getSource()==item2)
s=String.format("the field is %s", e.getActionCommand());

else if(e.getSource()==item3)
s=String.format("the field is %s", e.getActionCommand());

else if(e.getSource()== passward)
s=String.format("passward : %s", e.getActionCommand());

JOptionPane.showMessageDialog(null,s);
}

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class init4
{
public static void main (String args[])
{
db s =new db();
s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
s.setSize(400,400);
s.setVisible(true);
}
}


