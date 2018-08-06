import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

class db extends JFrame
{
    JTextField item1;
    JTextField item2;
    JTextField item3;
    JPasswordField passward;
    db()
    {
    super("the title bar");
    setLayout(new FlowLayout());
    item1 =new JTextField(100);//100 is the size of the box
    add(item1);
    item2 =new JTextField("enter text here");
    add(item2);
    item3 =new JTextField("uneditable",20);
    item3.setEditable(false);//can't be edited
    add(item3);
    passward=new JPasswordField("my passwd");//for the passward
    add(passward);
    }
}

class init3
{
public static void main (String args[])
    {
db s =new db();
s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
s.setSize(400,400);
s.setVisible(true);
    }
}
