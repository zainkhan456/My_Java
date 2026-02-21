//implementing multiple interfaces
//Here two interfaces are implemented i-e ActionListener and MouseMotion Listener
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;
class GUI implements ActionListener,MouseMotionListener{
    JFrame frame;
    JButton ok,exit;
    JLabel label;
    int xAxis,yAxis;
    public void init(){
        frame = new JFrame("Multiple Interfaces");
        ok = new JButton("ok");
        exit = new JButton("exit");
        label = new JLabel("Move the mouse on the frame");
        frame.add(ok);
        frame.add(exit);
        frame.add(label);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ok.addActionListener(this);
        exit.addActionListener(this);
        frame.addMouseMotionListener(this);
    }
    public GUI(){
        init();
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == ok)
            JOptionPane.showMessageDialog(frame,"You have clicked the ok button");
        if(ae.getSource() == exit)
            System.exit(0);
    }
    public void mouseMoved(MouseEvent me){
        xAxis = me.getX();
        yAxis = me.getY();
        label.setText(xAxis + " , " + yAxis);
    }
    public void mouseDragged(MouseEvent me){
        System.out.println("The mouse was dragged on the frame");
    }
}
public class Test{
    public static void main(String[] args){
        GUI g = new GUI();
    }
}