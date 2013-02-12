import javax.swing.JFrame;

public class bullseyecomponent


{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(180, 250);
        frame.setTitle("Face");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        bullseye component = new bullseye();
        frame.add(component);
        
        frame.setVisible(true);
        
    }}