//implementing multiple interfaces
//Here four interfaces are implemented i-e ActionListener,MouseMotionListener,MouseListener and windowListener
//In this example we want that when i click on any part of the frame it should return me the pixel value of that part.
//In addition to this example we want that when our window opens we get a welcome message and on closing it ask for closing
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;
class GUI implements ActionListener,MouseMotionListener,MouseListener,WindowListener{
    JFrame frame;
    JButton ok,exit;
    JLabel label;
    int xAxis,yAxis;
    public void init(){
        frame = new JFrame("Multiple Interfaces");
        ok = new JButton("ok");
        exit = new JButton("exit");
        label = new JLabel("Move the mouse on the frame");
        frame.add(ok);
        frame.add(exit);
        frame.add(label);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ok.addActionListener(this);
        exit.addActionListener(this);
        frame.addMouseMotionListener(this);
        frame.addMouseListener(this);
        frame.addWindowListener(this);
    }
    public GUI(){
        init();
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == ok)
            JOptionPane.showMessageDialog(frame,"You have clicked the ok button");
        if(ae.getSource() == exit)
            System.exit(0);
    }
    public void mouseMoved(MouseEvent me){
        xAxis = me.getX();
        yAxis = me.getY();
        label.setText(xAxis + " , " + yAxis);
    }
    public void mouseDragged(MouseEvent me){
        System.out.println("The mouse was dragged on the frame");
    }
    public void mouseClicked(MouseEvent me){
        JOptionPane.showMessageDialog(frame,"The mouse was clicked on " + me.getX() + " , " + me.getY() + " coordinates");
    }
    public void mousePressed(MouseEvent me){
        //Even when i don't need the remaining abstract methods still we must have to define these.
    }
    public void mouseReleased(MouseEvent me){
        
    }
    public void mouseEntered(MouseEvent me){
        
    }
    public void mouseExited(MouseEvent me){
        
    }
    public void windowOpened(WindowEvent we){
        JOptionPane.showMessageDialog(frame,"Welcome to My Program");
    }
    public void windowClosing(WindowEvent we){
        JOptionPane.showMessageDialog(frame,"Good bye have a nice day");
    }
    public void windowClosed(WindowEvent we){
        
    }
    public void windowActivated(WindowEvent we){
        
    }
    public void windowDeactivated(WindowEvent we){
        
    }
    public void windowIconified(WindowEvent we){
        
    }
    public void windowDeiconified(WindowEvent we){
        
    }
        
}
    
public class Test{
    public static void main(String[] args){
        GUI g = new GUI();
    }
}