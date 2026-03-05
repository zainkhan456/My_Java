//Inner classes
//Inner class mean a class within a class
// When we want to use multiple adapter classes in our program, we use inner classes.
// Inner classes help us organize different event-handling logic separately while keeping the code cleaner.
// This allows us to handle multiple events like mouse actions and window events using their respective adapter classes.
/*As multiple inheritance is not allowed in Java so we can't directly extends multiple adapter classes that's why we use
 concept */
//windowAdapter and mouseAdapter classes implementation.
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
class GUI extends WindowAdapter{
    JFrame frame;
    JButton ok,exit;
    public void init(){
        frame = new JFrame("Inner Classes Concept");
        ok = new JButton("Ok");
        exit = new JButton("Exit");
        frame.setLayout(new FlowLayout());
        frame.add(ok);
        frame.add(exit);
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addWindowListener(this);
//        MouseHandler mh = new MouseHandler();//Here storing reference
//        ok.addMouseListener(mh);
//        exit.addMouseListener(mh);or
        ok.addMouseListener(new MouseHandler());//here not storing reference
        exit.addMouseListener(new MouseHandler());

    }
    public GUI(){
        init();
    }
    public void windowOpened(WindowEvent we){
        JOptionPane.showMessageDialog(frame, "Welcome");
    }
    public void windowClosing(WindowEvent we){
        JOptionPane.showMessageDialog(frame, "Good Bye");
    }
    private class MouseHandler extends MouseAdapter{//MouseHandler is not a builtin class but a userdefine inner class
        public void mouseClicked(MouseEvent me){
            if(me.getSource() == ok)
                JOptionPane.showMessageDialog(frame,"You have clicked the ok button");
            if(me.getSource() == exit){
                JOptionPane.showMessageDialog(frame,"you have clicked the exit button");
                System.exit(0);
            }
        }
    }
}
public class Test{
    public static void main(String[] args){
        //GUI g = new GUI();
        new GUI();
    }
}