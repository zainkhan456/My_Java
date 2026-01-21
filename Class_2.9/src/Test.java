//Event Handling
/*For Event Hanling we are required three things i-e 1) GUI component to interact with and can generate events.
  2)An event Handler class to handle these events.(events are consider as objects in java)
  3)Registeration between event generator and event handler*/
  
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.*;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;
//There is only one abstract method in ActionListerner interface i-e actionPerformed(AcionEvent ae)
class GUI implements ActionListener{//step2. GUI is the class which contains the event Handling code.
    JFrame frame;
    JButton ok,cancel,exit;
    public void init(){
        frame = new JFrame("Event Handling");
        ok = new JButton("ok");//step1. JButton is my GUI component to interact with.
        cancel = new JButton("cancel");
        exit = new JButton("exit");
        frame.setLayout(new FlowLayout());
        frame.add(ok);
        frame.add(cancel);
        frame.add(exit);
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        ok.addActionListener(this);//step3. Registeration between ok button(Action genarator) and event handler (GUI Class).
        cancel.addActionListener(this);
        exit.addActionListener(this);
    }
    public GUI(){
        init();
    }
    public void actionPerformed(ActionEvent ae){//I will write the event handling code in this method
        if(ae.getSource() == ok){
//        JOptionPane.showMessageDialog(null,"You have clicked the ok button");
        JOptionPane.showMessageDialog(frame,"You have clicked the ok button");//Message box will now appear on frame 
        //whenever we click the ok button.
        }
        if(ae.getSource() == cancel){
            JOptionPane.showMessageDialog(frame,"You have clicked the cancel button");
        }
//        if(ae.getSource() == exit){
//            System.exit(0);//Simple version
//        }
        if(ae.getSource() == exit){//Modified version
            int option = JOptionPane.showConfirmDialog(frame,"Do You really want to exit?","Exit Application" ,JOptionPane.YES_NO_OPTION);
            if(option == JOptionPane.YES_OPTION)//or if(option == 0)
                System.exit(0);//no need to write else statement
        }
    }
        
}
public class Test{
    public static void main(String[] args){
        GUI g = new GUI();
    }
}