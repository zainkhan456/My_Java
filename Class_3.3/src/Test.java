//Event Handling
//Mouse Motion Listener
//It has two abstract methods i-e mouseMoved and mouseDragged
//Example1
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
class GUI implements MouseMotionListener{
    JFrame frame;
    JLabel label;
    public void init(){
        frame = new JFrame("Mouse Motion Listener");
        label = new JLabel("Example Of Mouse Motion Listener");
        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.addMouseMotionListener(this);
        
    }
    public GUI(){
        init();
    }
    public void mouseMoved(MouseEvent me){
        label.setText("Mouse is being moved on the frame");
        System.out.println("Mouse is being moved on the frame");
    }
    public void mouseDragged(MouseEvent me){
        label.setText("Mouse is being dragged on the frame");
        System.out.println("Mouse is being dragged on the frame");
    }
}
public class Test{
    public static void main(String[] args){
        GUI g = new GUI();
    }
}