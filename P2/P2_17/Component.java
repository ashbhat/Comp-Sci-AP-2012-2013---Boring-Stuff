import javax.swing.JFrame;

public class Component


{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(180, 250);
        frame.setTitle("Fit");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Viewer component = new Viewer();
        frame.add(component);
        
        frame.setVisible(true);
        
    }}