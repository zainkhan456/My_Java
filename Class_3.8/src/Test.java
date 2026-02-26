//Adapter Classes (3rd method of implementing Listener interfaces)
// Adapter class helps avoid writing all methods of an interface by giving default (empty) ones
// MouseListener → MouseAdapter: handles mouseClicked, mousePressed, mouseReleased, mouseEntered, mouseExited
// MouseMotionListener → MouseMotionAdapter: handles mouseMoved,mouseDragged
/*WindowListener → WindowAdapter: handles windowOpened,windowClosing,windowClosed,windowActivated, windowDeactivated
  windowIconified,windowDeiconified */
//////////////////////////////////////////////////////////////////////////////////////////////////

//Adapter class for MouseMotionListener Interface

import javax.swing.*;
import java.awt.event.*;
//Here GUI extends MouseMotionAdapter class mean MouseMotionAdapter is the parent class of the GUI.
//So GUI can use all or some methods of the parent class according to it's need.
/*MouseMotionListener interface have two abstract methods i-e mouseMoved & mouseDraged but you don't need
  to define both if you don't need it.*/
class GUI extends MouseMotionAdapter{
    JFrame frame;
    public void init(){
        frame = new JFrame("Adapter Classes");
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.addMouseMotionListener(this);
    }
    public GUI(){
        init();
    }
    public void mouseMoved(MouseEvent me){
        System.out.println("Mouse was moved on the frame");
    }
}
public class Test{
    public static void main(String[] args){
        GUI g = new GUI();
    }
}
