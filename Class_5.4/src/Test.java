//Multiple Exception Handling
//Here will handle two types of exception i-e Arithmetic Exception and NumberFormateException
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
                result = a/b;
                JOptionPane.showMessageDialog(null,"The result division is " + result);
                repeat = false;
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null,"Please only enter integer values!!! Try again.");
            }
            catch(ArithmeticException ae){
                JOptionPane.showMessageDialog(null,"Donot Divide by zero!!! Try again.");
            }
        }
        JOptionPane.showMessageDialog(null, "Your Program will terminate now");
    }
}