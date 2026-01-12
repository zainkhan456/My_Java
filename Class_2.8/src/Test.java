//Complex GUI Example 
//Also aaplying some color properties
//There are about 13 built in colors provided by java,others should be define by the user
//To use color import color class from awt pkg
/*We can only change the background or forground color of the component area of the frame 
  but not the title bar area.so we cant write directly as frame.setBackground(Color.red)
  bcz it also is applied to the title bar area which can't be change so it will not give us the error nor
  change the background color of the frame so to handle it we have to get the address or reference of the 
  component area of the frame i-e Container con = frame.getContentPane();//import Container class from awt.*/
  
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Container;
class GUI{
    JFrame frame;
    JPanel textPanel,buttonPanel;
    JLabel lblID,lblName,lblAddress;
    JTextField txtID,txtName,txtAddress;
    JButton btnFirst,btnPrevious,btnNext,btnLast,btnExit,btnAdd,btnDelete,btnEdit,btnCancel,btnSave;
    public void init(){
        frame = new JFrame("Complex GUI");
        textPanel = new JPanel();
        buttonPanel = new JPanel();
        //////////////////////////////////////////////////
        lblID = new JLabel("Student Id: ");
        lblName = new JLabel("Student Name: ");
        lblAddress = new JLabel("Student Address: ");
        lblID.setForeground(Color.white);//change the color of the label text
        //Change color after initialization.
        txtID = new JTextField(10);
        txtName = new JTextField(10);
        txtAddress = new JTextField(10);
        txtID.setBackground(Color.red);//Change the bacground color of the txt Field.
        txtID.setForeground(Color.YELLOW);//Change the color of the text insid the txt Field.
        ///////////////////////////////////////////////////
        btnFirst = new JButton("First");
        btnPrevious = new JButton("Previous");
        btnNext = new JButton("Next");
        btnLast = new JButton("Last");
        btnExit = new JButton("Exit");
        btnAdd = new JButton("Add");
        btnDelete = new JButton("Delete");
        btnEdit = new JButton("Edit");
        btnCancel = new JButton("Cancel");
        btnSave = new JButton("Save");
        btnFirst.setForeground(Color.red);
        btnFirst.setBackground(Color.BLACK);
        ////////////////////////////////////////////////////
        textPanel.setLayout(new GridLayout(3,2,5,40));
        textPanel.add(lblID);       textPanel.add(txtID);
        textPanel.add(lblName);     textPanel.add(txtName);
        textPanel.add(lblAddress);  textPanel.add(txtAddress);
        //////////////////////////////////////////////////////
        buttonPanel.setLayout(new GridLayout(2,5));
        buttonPanel.add(btnFirst);  buttonPanel.add(btnPrevious);
        buttonPanel.add(btnNext);   buttonPanel.add(btnLast);
        buttonPanel.add(btnExit);   buttonPanel.add(btnAdd);
        buttonPanel.add(btnDelete); buttonPanel.add(btnEdit);
        buttonPanel.add(btnCancel); buttonPanel.add(btnSave);
        ////////////////////////////////////////////////////////
//        frame.setLayout(new BorderLayout());
        frame.add(textPanel,BorderLayout.NORTH);
        frame.add(buttonPanel,BorderLayout.SOUTH);
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true); 
        ////////////////////////////////////////////////////////////
        Container con = frame.getContentPane();
        con.setBackground(Color.LIGHT_GRAY);//It change the color of the component area of the frame only but not the panel color.
        textPanel.setBackground(Color.LIGHT_GRAY);
        buttonPanel.setBackground(Color.LIGHT_GRAY);
        /////////////////////////////////////////////////////////////
        //To Use your color of your own choice we have to define it first (RGB)
        Color c = new Color(105,211,162);
        con.setBackground(c);//Will override the previous Light grey color.
        
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
    
