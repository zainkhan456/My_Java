//implementing adapter class and interfaces together
//Making simple Calculator GUI

import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
class GUI extends WindowAdapter implements ActionListener{
    JFrame frame;
    JButton plus,mult;
    JLabel lbl1,lbl2,lbl3;
    JTextField txt1,txt2,txt3;
    int no1,no2,result;
    String value;
    public void init(){
        frame = new JFrame("My Calculator");
        plus = new JButton("+");
        mult = new JButton("*");
        lbl1 = new JLabel("First Number: ");
        lbl2 = new JLabel("Second Number: ");
        lbl3 = new JLabel("Result:      ");
        txt1 = new JTextField(8);
        txt2 = new JTextField(8);
        txt3 = new JTextField(8);
        frame.setLayout(new FlowLayout());
        frame.add(lbl1);        frame.add(txt1);
        frame.add(lbl2);        frame.add(txt2);
        frame.add(plus);        frame.add(mult);
        frame.add(lbl3);        frame.add(txt3);
        frame.setVisible(true);
        frame.setSize(225,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.addWindowListener(this);
        plus.addActionListener(this);
        mult.addActionListener(this);
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
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == plus){
            value = txt1.getText();
            no1 = Integer.parseInt(value);
            value = txt2.getText();
            no2 = Integer.parseInt(value);
            result = no1 + no2;
            txt3.setText(result + "");
        }
        if(ae.getSource() == mult){
            value = txt1.getText();
            no1 = Integer.parseInt(value);
            value = txt2.getText();
            no2 = Integer.parseInt(value);
            result = no1 * no2;
            txt3.setText(result + "");
        }
    }
}
public class Test{
    public static void main(String[] args){
        //GUI g = new GUI(); //Storing refernece of the object in variable g
        new GUI(); //Not storing the reference.Both are correct.No affect on functionality
    }
}