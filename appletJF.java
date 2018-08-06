import javax.swing.*;
import java.awt.*;
            
public class appletJF  extends JApplet
{
    private void createGUI()
    {
        
       /* JLabel appletLabel = new JLabel( "I'm a Swing Applet",5 );
        appletLabel.setHorizontalAlignment( JLabel.CENTER );
        appletLabel.setFont(new Font("Serif", Font.PLAIN, 36));
        add(appletLabel);
        JTextField item1=new JTextField("helllo",20);
        item1.setHorizontalAlignment( JTextField.CENTER);
        add(item1); 
*/
        JTextField item2=new JTextField("hey",20);
        item2.setHorizontalAlignment( JTextField.CENTER);
        add(item2);
        
        setSize(1000,800);
    }

    @Override
    public void init()
    {
        try
        {
            SwingUtilities.invokeAndWait(new Runnable()
            {
                @Override
                public void run()
                {
                    createGUI();
                }
            });
        }
        catch (Exception e)
        {
            System.err.println("createGUI didn't successfully complete: " + e);
        }
    }

    public static void main(String[] args)
    {
        JApplet applet = new appletJF();
        applet.init();

        JFrame frame = new JFrame("Applet in Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(applet);
        frame.pack();
        frame.setLocationRelativeTo( null );
        frame.setVisible( true );
        
        applet.start();
    }
}