import javax.swing.JFrame;

public class FaceComponent


{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(180, 250);
        frame.setTitle("Face");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FaceViewer component = new FaceViewer();
        frame.add(component);
        
        frame.setVisible(true);
        
    }}