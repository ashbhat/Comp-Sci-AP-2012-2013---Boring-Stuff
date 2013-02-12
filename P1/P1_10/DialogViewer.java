import javax.swing.JOptionPane;

public class DialogViewer
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("What's your name?");
        System.out.print("Hello ");
        System.out.print(name);
        System.out.print("!");
        System.exit(0);
    }   
}