//NumberFormatException
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
class GUI extends WindowAdapter implements ActionListener{
    JFrame frame;
    JButton plus,mult;
    JLabel lbl1,lbl2,lbl3;
    JTextField tf1,tf2,tf3;
    int no1,no2,result;
    String value;
    public void init(){
        frame = new JFrame("Exception Handling");
        plus = new JButton("+");
        mult = new JButton("*");
        lbl1 = new JLabel("First Number: ");
        lbl2 = new JLabel("Second Number: ");
        lbl3 = new JLabel("Result");
        tf1 = new JTextField(10);
        tf2 = new JTextField(10);
        tf3 = new JTextField(10);
        frame.setLayout(new FlowLayout());
        frame.add(lbl1);    frame.add(tf1);
        frame.add(lbl2);    frame.add(tf2);
        frame.add(plus);    frame.add(mult);
        frame.add(lbl3);    frame.add(tf3);
        frame.setVisible(true);
        frame.setSize(200,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.addWindowListener(this);
        plus.addActionListener(this);
        mult.addActionListener(this);
    }
    public void windowOpened(WindowEvent we){
        JOptionPane.showMessageDialog(frame,"Welcome");
    }
    public void windowClosing(WindowEvent we){
        JOptionPane.showMessageDialog(frame,"Good Bye");
    }
    public void actionPerformed(ActionEvent ae){
        try{
            if(ae.getSource() == plus){
            value = tf1.getText();
            no1 = Integer.parseInt(value);
            value = tf2.getText();
            no2 = Integer.parseInt(value);
            result = no1 + no2;
            tf3.setText(result + "");
        }
        if(ae.getSource() == mult){
            value = tf1.getText();
            no1 = Integer.parseInt(value);
            value = tf2.getText();
            no2 = Integer.parseInt(value);
            result = no1 * no2;
            tf3.setText(result + "");           
        }
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(frame,"Please only enter integers!!! Try again.");
        }
    }

        public GUI(){
        init();
    }
}
public class Test{
    public static void main(String[] args){
        GUI g = new GUI();
    }
}