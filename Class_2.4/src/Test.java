//Grid Layout 
/*when the layout is grid the whole frame is behaving like a grid mean it is divided into 
  rows and columns or cells and in each cell we can have one component forexample
  3 * 2 layout mean we can add 6 components*/
  
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
class GUI{
    JFrame frame;
    JButton b1,b2,b3,b4,b5,b6;
    public void init(){
        frame = new JFrame("My Window GridLayout");
        b1 = new JButton("Inayat Khan");
        b2 = new JButton("N Bibi");
        b3 = new JButton("Zain Ul Islam");
        b4 = new JButton("Muhammad Hasnain Khan");
        b5 = new JButton("G Bibi");
        b6 = new JButton("Ihtisham Ul Haq");
//        frame.setLayout(new GridLayout(3,2));//3 * 2 Grid Layout
        frame.setLayout(new GridLayout(3,2,30,15));//3 * 2 Grid Layout
        //Gap b/w 1 & 2 and so on are called horizontal gap while the gap b/w 1 & 3 and so on are called vertical gap.
        //30 = Horizontal gap,15 = vertical gap
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
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
