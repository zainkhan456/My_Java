// Adapter class for WindowListener interface
// WindowAdapter class
// WindowListener interface has seven methods i.e. windowOpened, windowClosing, windowClosed, windowIconified, windowDeiconified, windowActivated, windowDeactivated
// You don't have to implement all if you don't need

import javax.swing.*;
import java.awt.event.*;
class GUI extends WindowAdapter{
    JFrame frame;
    public void init(){
        frame = new JFrame("Adapter Class");
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.addWindowListener(this);
        
    }
    public GUI(){
        init();
    }
    public void windowOpened(WindowEvent we){
        JOptionPane.showMessageDialog(frame,"Welcome");
    }
    public void windowClosing(WindowEvent we){
        JOptionPane.showMessageDialog(frame,"Good bye");
    }
}
public class Test{
    public static void main(String[] args){
        GUI g = new GUI();
    }
}
