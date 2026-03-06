//Enhancing our previous program
//implementing one new interface FocusListener interface which have 2 abstract methods i-e focusGained and focusLost.
//Inner class for implementing WindowAdapter and MouseAdapter classes and MouseMotionListener interface.
//inner classes can not only extend Adapter classes it can also implements any interface.

import java.awt.Color;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.awt.Container;
class GUI implements FocusListener{
    JFrame frame;
    JButton ok,exit;
    JTextField tf1,tf2;
    Container con;
    
    public void init(){
        frame = new JFrame("Inner classes");
        ok = new JButton("Ok");
        exit = new JButton("Exit");
        tf1 = new JTextField("Zain Ul Islam Here");
        tf2 = new JTextField("A Software Engineer");
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setSize(250,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.add(ok);
        frame.add(exit);
        frame.add(tf1);
        frame.add(tf2);
        con = frame.getContentPane();
        con.setBackground(Color.red);
        frame.addWindowListener(new WindowHandler());
        ok.addMouseListener(new MouseHandler());
        exit.addMouseListener(new MouseHandler());
        frame.addMouseMotionListener(new MouseMotionHandler());
        tf1.addFocusListener(this);
        tf2.addFocusListener(this);
    }
    public GUI(){
        init();
    }
    private class WindowHandler extends WindowAdapter{
        public void windowOpened(WindowEvent we){
            JOptionPane.showMessageDialog(frame, "Welcome Zain");
        }
        public void windowClosing(WindowEvent we){
            JOptionPane.showMessageDialog(frame,"Good Bye Zain");
        }
    }
    private class MouseHandler extends MouseAdapter{
        public void mouseClicked(MouseEvent me){
            if(me.getSource() == ok)
                JOptionPane.showMessageDialog(frame, "You have clicked ok Button");
            if(me.getSource() == exit){
                JOptionPane.showMessageDialog(frame,"You have clicked exit Button");
                System.exit(0);
            }
        }
    }
    private class MouseMotionHandler implements MouseMotionListener{
    //Here you can implement MouseMotionListener interface as well as extends MouseMotionAdapter class.
        public void mouseMoved(MouseEvent me){
            con.setBackground(Color.red);
        }
        public void mouseDragged(MouseEvent me){
            con.setBackground(Color.YELLOW);
        }
    }
    public void focusGained(FocusEvent fe){
        if(fe.getSource() == tf1)
            tf1.setForeground(Color.red);
        if(fe.getSource() == tf2)
            tf2.setForeground(Color.red);
    }
    public void focusLost(FocusEvent fe){
        if(fe.getSource() == tf1)
            tf1.setForeground(Color.BLACK);
        if(fe.getSource() == tf2)
            tf2.setForeground(Color.BLACK);
    }
}
public class Test{
    public static void main(String[] args){
        GUI g = new GUI();
    }
}