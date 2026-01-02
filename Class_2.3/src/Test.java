//Starting GUI

//FLow Laylout
/*Introduction:For GUI awt package can also be used but here we use the lattest pkg name swing because the GUI made 
  with awt depend upon the operating system on which you are doing the development and that's why it's components 
  are called heavy weight GUI components while the swing is independent of the operating system and that's why its 
  components are called light weight components.It doesn't mean that we will totally not use awt.*/
//In java windows are called frames.
//There are about 8 types of layouts e.g Border Layout(default layout),Flow layout,Grid layout etc.

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.FlowLayout;
class GUI{
    JFrame frame;
    JButton ok,cancel;
    JTextField text;
    JLabel label;
    public void init(){
    frame = new JFrame("My Window");
    ok = new JButton("ok");
    cancel = new JButton("cancel");
    text = new JTextField("Enter some text here...");
    label = new JLabel("User Name: ");
    frame.setLayout(new FlowLayout());
    frame.add(label);
    frame.add(text);
    frame.add(ok);
    frame.add(cancel);
    frame.setVisible(true);
    frame.setSize(400,350);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
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