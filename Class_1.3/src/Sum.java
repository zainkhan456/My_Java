//GUI Input And Output Program To Add Two Numbers
import javax.swing.JOptionPane;
public class Sum{
    public static void main(String[] args){
        int a,b,sum;
        String value;
        value = JOptionPane.showInputDialog("Enter your first number: ");
        a = Integer.parseInt(value);
        value = JOptionPane.showInputDialog("Enter your second number: ");
        b = Integer.parseInt(value);
        sum = a + b;
        JOptionPane.showMessageDialog(null,"The sum of "+a +" and "+b +" is "+sum);
    }
}