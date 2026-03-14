//Handling events using Anonymous inner classes
//Instead of implementing MouseListener and WindowListener Interfaces here we will extend their Adapter classes.
//Also implementing MouseMotionListener interface.
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.Container;
class GUI{
    JFrame frame;
    JButton ok,exit;
    Container con;
    public void init(){
        frame = new JFrame("Anonymous Inner classes");
        con = frame.getContentPane();
        con.setBackground(Color.white);
        ok = new JButton("Ok");
        exit = new JButton("Exit");
        frame.setLayout(new FlowLayout());
        frame.add(ok);
        frame.add(exit);
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        //Anonymous classes
        ok.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent me){
                JOptionPane.showMessageDialog(frame,"You have clicked the ok button");
            }
            //No need to define the remaining methods
        });
        exit.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent me){
                JOptionPane.showMessageDialog(frame, "You have clicked the exit button");
                System.exit(0);
            }
            //No need to define the remaining methods        
        });
        frame.addWindowListener(new WindowAdapter(){
            public void windowOpened(WindowEvent we){
                JOptionPane.showMessageDialog(frame,"Welcome Zain");
            }
            public void windowClosing(WindowEvent we){
                JOptionPane.showMessageDialog(frame,"Good Bye");
            }
            //No need to define the remaining methods
        });
        frame.addMouseMotionListener(new MouseMotionListener(){
            public void mouseMoved(MouseEvent me){
                con.setBackground(Color.white);
            }
            public void mouseDragged(MouseEvent me){
                con.setBackground(Color.BLACK);
            }
        
        });
    }
    public GUI(){
        init();
    }
}
public class Test{
    public static void main(String[] args){
        new GUI();//This is called Anonymous Object
    }
}