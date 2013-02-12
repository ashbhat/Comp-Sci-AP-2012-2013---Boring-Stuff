import javax.swing.JFrame;

public class BullsEyeViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(180, 250);
        frame.setTitle("Face");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BullsEye component = new BullsEye(50, 100, 100);
        frame.add(component);
        frame.setVisible(true);
    }}
