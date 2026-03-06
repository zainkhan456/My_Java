//Inner class for implementing WindowAdapter and MouseAdapter classes and MouseMotionListener interface.
//inner classes can not only extend Adapter classes it can also implements any interface.

import java.awt.Color;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.awt.Container;
class GUI{
    JFrame frame;
    JButton ok,exit;
    Container con;
    public void init(){
        frame = new JFrame("Inner classes");
        ok = new JButton("Ok");
        exit = new JButton("Exit");
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.add(ok);
        
        frame.add(exit);
        con = frame.getContentPane();
        con.setBackground(Color.red);
        frame.addWindowListener(new WindowHandler());
        ok.addMouseListener(new MouseHandler());
        exit.addMouseListener(new MouseHandler());
        frame.addMouseMotionListener(new MouseMotionHandler());
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
}
public class Test{
    public static void main(String[] args){
        GUI g = new GUI();
    }
}