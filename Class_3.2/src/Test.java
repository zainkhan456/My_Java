//Event Handling
//WindowListener Interface
//it has total 7 abstract method which is related to the events of JFrame or window 
gi
import javax.swing.JFrame;
import java.awt.event.*;
class GUI implements WindowListener{
    JFrame frame;
    public GUI(){
        init();
    }
    public void init(){
        frame = new JFrame("Window Listener");
        frame.setVisible(true);
        frame.setSize(400,400);
          //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
/*There is difference between exit on close and dispose on close which can be explain when we have two frames.when we 
  click the the close button of a window which have the dispose on close method,that particular window will close 
  while the other window will not close and the application will also not close while when we click the close button
  of a window which have the exit on close method,it will close all the windows as well as the application or program.*/
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(true);
        frame.addWindowListener(this);
    }
    public void windowOpened(WindowEvent we){
        System.out.println("Window Opened successfully");
    }
    public void windowClosing(WindowEvent we){
        System.out.println("Window is closing now");
    }
    public void windowClosed(WindowEvent we){//This will not run whensetDefaultCloseOperation is EXIT_ON_CLOSE
        System.out.println("Window is closed successfully");
    }
    public void windowActivated(WindowEvent we){
        System.out.println("Window is Activated"); 
    }
    public void windowDeactivated(WindowEvent we){
        System.out.println("Window is Deactivated");
    }
    public void windowIconified(WindowEvent we){
        System.out.println("Window is iconified"); 
    }
    public void windowDeiconified(WindowEvent we){
        System.out.println("Window is Deiconified");   
    }
    
}
public class Test{
    public static void main(String[] args){
        GUI g = new GUI();
    }
}