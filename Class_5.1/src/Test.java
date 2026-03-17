//NumberFormatException
/*
    It is occur due to three types of exception i-e 
    1.Entering no value in the input box and pressing ok
    2.Input wrong value in the input box
    3.pressing cancel button
*/

import javax.swing.JOptionPane;
public class Test{
    public static void main(String[] args){
        int a,b,result;
        String value;
        boolean repeat = true;
        while(repeat){
            try{
                value = JOptionPane.showInputDialog("Enter Your First Number: ");
                a = Integer.parseInt(value);
                value = JOptionPane.showInputDialog("Enter Your Seccond Number: ");
                b = Integer.parseInt(value);
                result = a + b;
                JOptionPane.showMessageDialog(null,"The result adding a and b is " + result);
                repeat = false;
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null,"Please only enter integer values!!! Try again.");
            }
        }
        JOptionPane.showMessageDialog(null, "Your Program will terminate now");
    }
}