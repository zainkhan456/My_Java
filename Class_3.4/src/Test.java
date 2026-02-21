//MouseMotionListener interface
//Example2

import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;
import java.awt.Color;
import java.awt.FlowLayout;
class GUI implements MouseMotionListener{
    JFrame frame;
    JLabel label;
    int xAxis,yAxis;
    Container con;
    public GUI(){
     init();   
    }
    public void init(){
        frame = new JFrame("MouseMotion Listener");
        con = frame.getContentPane();
        label = new JLabel("Example Of Mouse Motion Listener");
        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.addMouseMotionListener(this);
    }
    public void mouseMoved(MouseEvent me){
        xAxis = me.getX();
        yAxis = me.getY();
        label.setText(xAxis + " , " + yAxis);
        con.setBackground(Color.GRAY);
    }
    public void mouseDragged(MouseEvent me){
        //JOptionPane.showMessageDialog(null,"You have dragged mouse on the window");
        con.setBackground(Color.MAGENTA);
    }
}
public class Test{
    public static void main(String[] args){
     GUI g = new GUI();   
    }
}