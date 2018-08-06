import javax.swing.JOptionPane;
class int1
{
    public static void main(String args[])
    {
        String fn=JOptionPane.showInputDialog("enter the number");//enter first number is stored in the string first
        String sn=JOptionPane.showInputDialog("enter the number");
        int num1=Integer.parseInt(fn);
        int num2=Integer.parseInt(sn);
        int sum=num1+num2;
        JOptionPane.showMessageDialog(null,"the answer is"+sum,"yoo",JOptionPane.PLAIN_MESSAGE);
        /* the showmessageDialog has 4 parameters
        1.postition ,2.message,3.title bar name,4.message going to be popup */

    }
}