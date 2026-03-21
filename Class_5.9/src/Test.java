//Method 1
import java.util.Scanner;
class InvalidInput extends Exception{
    public InvalidInput(){
        super("Enter a number b/w 0 and 9 only.Please Try again");
    }
}
public class Test{
    public static void main(String[] args){
        int num,result = 1;
        Scanner input = new Scanner(System.in);       
        boolean repeat = true;
        while(repeat){
            try{
                System.out.println("Enter a number b/w 0 and 10 to calculate it's square: ");
                num = input.nextInt();
                result = num * num;
                if(num < 0 || num > 10)
                    throw new InvalidInput();
                System.out.println("The square of " + num + " is " + result);
                repeat = false;
        }
            catch(InvalidInput ip){
                //System.out.println("Enter a number b/w 0 and 10 only!!!.\n"); or
                System.out.println("Invalid input");
                System.out.println(ip);
                
            }
        }
        }
    }
        
 