//In this method we extends JFrame to the child Test Class so its method can be call by the child class 
import javax.swing.*;
import java.awt.GridLayout;
public class Test extends JFrame{
    JButton b1,b2,b3,b4,b5,b6;
    public Test(){
        init();
    }
    public void init(){
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        setLayout(new GridLayout(3,2,100,100));
        add(b1);    add(b2);
        add(b3);    add(b4);
        add(b5);    add(b6);
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
    }
    public static void main(String[] args){
        Test t = new Test();
    }
}
    
