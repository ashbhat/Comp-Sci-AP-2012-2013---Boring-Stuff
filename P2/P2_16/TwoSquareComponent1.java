import javax.swing.JFrame;

public class TwoSquareComponent1


{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(150, 250);
        frame.setTitle("TwoSquare");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TwoSquareViewer1 component = new TwoSquareViewer1();
        frame.add(component);
        
        frame.setVisible(true);
        
    }}