//Handling events using Anonymous inner classes
//For ActionListener Interface
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
        ok.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                JOptionPane.showMessageDialog(frame,"You have clicked the ok button");
            }
        });
        exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                JOptionPane.showMessageDialog(frame,"You have clicked the exit button");
                System.exit(0);
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