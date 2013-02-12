import javax.swing.JFrame;

public class housecomponent


{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(180, 250);
        frame.setTitle("Exploratoriam");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        house component = new house();
        frame.add(component);
        
        frame.setVisible(true);
        
    }}