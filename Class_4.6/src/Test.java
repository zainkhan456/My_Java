//Handling events using Anonymous inner classes
//Implement MouseListener and WindowListener Interface

import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
class GUI{
    JFrame frame;
    JButton ok,exit;
    public void init(){
        frame = new JFrame("Anonymous Inner classes");
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
        ok.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent me){
                JOptionPane.showMessageDialog(frame,"You have clicked the ok button");
            }
            public void mousePressed(MouseEvent me){
                
            }
            public void mouseReleased(MouseEvent me){
                
            }
            public void mouseEntered(MouseEvent me){
                
            }
            public void mouseExited(MouseEvent me){
                
            }
        });
        exit.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent me){
                JOptionPane.showMessageDialog(frame, "You have clicked the exit button");
                System.exit(0);
            }
            public void mousePressed(MouseEvent me){
                
            }
            public void mouseReleased(MouseEvent me){
                
            }
            public void mouseEntered(MouseEvent me){
                
            }
            public void mouseExited(MouseEvent me){
                
            }
        });
        frame.addWindowListener(new WindowListener(){
            public void windowOpened(WindowEvent we){
                JOptionPane.showMessageDialog(frame,"Welcome Zain");
            }
            public void windowClosing(WindowEvent we){
                JOptionPane.showMessageDialog(frame,"Good Bye");
            }
            public void windowClosed(WindowEvent we){
                
            }
            public void windowActivated(WindowEvent we){
                
            }
            public void windowDeactivated(WindowEvent we){
                
            }
            public void windowIconified(WindowEvent we){
                
            }
            public void windowDeiconified(WindowEvent we){
                
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