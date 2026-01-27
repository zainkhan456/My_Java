//Event Handling
//Mouse Listener interface 
//It has Five abstract methods i-e mouseClicked,mousePressed,mouseReleased,mouseEntered,mouseExited.
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.JOptionPane;
class GUI implements MouseListener{
    JFrame frame;
    JButton click,press,release,enter,exit;
    public GUI(){
        init();
    }
    public void init(){
        frame = new JFrame("MouseListerner");
        click = new JButton("click");
        press = new JButton("press");
        release = new JButton("release");
        enter = new JButton("enter");
        exit = new JButton("exit");
        frame.setLayout(new FlowLayout());
        frame.add(click);
        frame.add(press);
        frame.add(release);
        frame.add(enter);
        frame.add(exit);
        frame.setVisible(true);
        frame.setSize(700,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        click.addMouseListener(this);
        press.addMouseListener(this);
        release.addMouseListener(this);
        enter.addMouseListener(this);
        exit.addMouseListener(this);
    }
    public void mouseClicked(MouseEvent me){
        if(me.getSource() == click)
            JOptionPane.showMessageDialog(frame,"You have clicked the button");
    }
    public void mousePressed(MouseEvent me){
        if(me.getSource() == press)
            JOptionPane.showMessageDialog(frame,"You have Pressed the button");
    }
    public void mouseReleased(MouseEvent me){
        if(me.getSource() == release)
            JOptionPane.showMessageDialog(frame,"You have release the button");           
    }
    public void mouseEntered(MouseEvent me){
        if(me.getSource() == enter)
            JOptionPane.showMessageDialog(frame,"You have entered the button region");
    }
    public void mouseExited(MouseEvent me){
        if(me.getSource() == exit)
            JOptionPane.showMessageDialog(frame, "You have exited the button regrion");
    }
}
public class Test{
    public static void main(String[] args){
        GUI g = new GUI();
    }
}