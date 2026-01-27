//Event Handling
//ActionListener Interface
//Simple Calculator

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;
class GUI implements ActionListener{
    JFrame frame;
    JLabel lblNo1,lblNo2,lblResult;
    JTextField txtNo1,txtNo2,txtResult;
    JButton plus,multiply;
    int no1,no2,result;
    String value;
    public void init(){
        frame = new JFrame("My Calculator");
        /////////////////////////////////////////
        lblNo1 = new JLabel("Frist Number: ");
        lblNo2 = new JLabel("Second Number: ");
        lblResult = new JLabel("Result: ");
        /////////////////////////////////////////
        txtNo1 = new JTextField(10);
        txtNo2 = new JTextField(10);
        txtResult = new JTextField(10);
        txtResult.setEditable(false);
        /////////////////////////////////////////
        plus = new JButton("+");
        multiply = new JButton("*");
        /////////////////////////////////////////
        frame.setLayout(new FlowLayout());
        frame.add(lblNo1);      frame.add(txtNo1);
        frame.add(lblNo2);      frame.add(txtNo2);
        frame.add(plus);         frame.add(multiply);
        frame.add(lblResult);   frame.add(txtResult);
        //////////////////////////////////////////
        frame.setVisible(true);
        frame.setSize(170,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);   
        /////////////////////////////////////////////
        plus.addActionListener(this);
        multiply.addActionListener(this);
    }        
    public GUI(){
        init();
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == plus){
            value = txtNo1.getText();
            no1 = Integer.parseInt(value);
            value = txtNo2.getText();
            no2 = Integer.parseInt(value);
            result = no1 +  no2;
            txtResult.setText(result + "");
        }
        if(ae.getSource() == multiply){
            value = txtNo1.getText();
            no1 = Integer.parseInt(value);
            value = txtNo2.getText();
            no2 = Integer.parseInt(value);
            result = no1 * no2;
            txtResult.setText(result + "");
        }
    }
}
public class Test{
    public static void main(String[] args){
        GUI g = new GUI();
    }
}