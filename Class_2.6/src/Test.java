//Complex GUI Example
//Grid Layout + Border Layout
//import javax.swing.JFrame;
//import javax.swing.JButton;
//import javax.swing.JLabel;
//import javax.swing.JTextField;
//import javax.swing.JPanel;
//Instead of importing one by one import all the pkgs of swing class at once.
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
class GUI{
    JFrame frame;
    JPanel panel;
    JLabel label;
    JTextField tf;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bClear,bPlus,bMinus,bMul,bDecimal,bEqual;
    public void init(){
        frame = new JFrame("My Calculator");
        panel = new JPanel();
        label = new JLabel("My calculator");
        tf = new JTextField();
        b0 = new JButton("0");b1 = new JButton("1");b2 = new JButton("2");b3 = new JButton("3");
        b4 = new JButton("4");b5 = new JButton("5");b6 = new JButton("6");b7 = new JButton("7");
        b8 = new JButton("8");b9 = new JButton("9");bClear = new JButton("C");bPlus = new JButton("+");
        bMinus = new JButton("-");bMul = new JButton("*");bDecimal = new JButton(".");bEqual = new JButton("=");
        //////////////////////////////////////////////////////////////////////////
        panel.setLayout(new GridLayout(4,4,10,10));
        panel.add(b1);        panel.add(b2);        panel.add(b3);        panel.add(bClear);
        panel.add(b4);        panel.add(b5);        panel.add(b6);        panel.add(bMul);
        panel.add(b7);        panel.add(b8);        panel.add(b9);        panel.add(bPlus);
        panel.add(b0);        panel.add(bDecimal);        panel.add(bMinus);        panel.add(bEqual);
        //////////////////////////////////////////////////////////////////////////
//        frame.setLayout(new BorderLayout());//not necessary to write bcz default layout
        frame.add(tf,BorderLayout.NORTH);
        frame.add(label,BorderLayout.SOUTH);
        frame.add(panel,BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        
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