//'throw' Keyword in java

import java.util.Scanner;
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
                    throw new ArithmeticException();
                System.out.println("The square of " + num + " is " + result);
                repeat = false;
        }
            catch(ArithmeticException ae){
                System.out.println("Enter a number b/w 0 and 10 only!!!.\n");
            }//But ArithmiticException is not to handle this kind of Exceptions.
        }//Therefore we will define our own class for handling such type of exception.
    }//It can be be handle by two ways.---->Next Program 
}
        
 