//Border Layout
//It is the default layout
//Didide the whole frame into five regions which are named as east,west,north,south and center.
/*tThe space b/w east & center and west & center is called horizontal gap while the space 
  between north & center and south & center is called vertical gap.*/
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
class GUI{
    JFrame frame;
    JButton b1,b2,b3,b4,b5;
    public void init(){
        frame = new JFrame("Border Layout");
        b1 = new JButton("East");
        b2 = new JButton("West");
        b3 = new JButton("North");
        b4 = new JButton("South");
        b5 = new JButton("Center");
//        frame.setLayout(new BorderLayout());//Not necessary to write this statement bcz it is default layout.
        frame.setLayout(new BorderLayout(50,15));//Necessary to write if you want to specify the gap.
        //50 = horizontal gap,15 = vertical gap
        //it is not necessary to add all five buttons but not more than five buttons can be added.
        //it you don't add a button the remaining buttons will be adjusted according to the screen or frame size.
        frame.add(b1,BorderLayout.EAST);
        frame.add(b2,BorderLayout.WEST);
        frame.add(b3,BorderLayout.NORTH);
        frame.add(b4,BorderLayout.SOUTH);
        frame.add(b5,BorderLayout.CENTER);
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