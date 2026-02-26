//Adapter class for MouseListener Interface
//MouseAdapter //this adapter class is also used for MouseMotionListener interface
//MouseListener interface have five method i-e mouseClicked,mousePressed,mouseRelease,mouseEntered,mouseExited.
//you don't have to implement all if you don't need.

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;
class GUI extends MouseAdapter{
    JFrame frame;
    JButton ok,exit;
    public void init(){
        frame = new JFrame("Adapter Class");
        ok = new JButton("Ok");
        exit = new JButton("Exit");
        frame.setLayout(new FlowLayout());
        frame.add(ok);
        frame.add(exit);
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        ok.addMouseListener(this);
        exit.addMouseListener(this);

    }
    public GUI(){
        init();
    }
    public void mouseClicked(MouseEvent me){
        if(me.getSource() == ok)
            System.out.println("Ok button was clicked");
        if(me.getSource() == exit)
            System.exit(0);
    }
}
public class Test{
    public static void main(String[] args){
        GUI g = new GUI();
    }
}
