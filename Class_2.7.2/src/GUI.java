//Two different Java classes are used

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;
class GUI{
    JFrame frame;
    JButton b1,b2,b3,b4,b5,b6;
    public void init(){
        frame = new JFrame("Grid Layout");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        frame.setLayout(new GridLayout(3,2,25,25));
        frame.add(b1);  frame.add(b2);
        frame.add(b3);  frame.add(b4);
        frame.add(b5);  frame.add(b6);
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
                
    }
    public GUI(){
        init();
    }
}
