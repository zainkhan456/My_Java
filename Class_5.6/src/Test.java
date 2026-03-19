//Finally Keyword

import java.util.Scanner;
import java.util.InputMismatchException;
public class Test{
    public static void main(String[] args){
        int a,b,result;
        Scanner input = new Scanner(System.in);
        boolean repeat = true;
        while(repeat){
            try{
                System.out.println("Enter your first number: ");
                a = input.nextInt();
                System.out.println("Enter your second number: ");
                b = input.nextInt();
                result = a/b;
                System.out.println("The result of division is: " + result);
                repeat = false;
            }
            catch(ArithmeticException ae){
                System.out.println("Donot divide by zero!!! Try again.");
            }
            catch(InputMismatchException ime){
                System.out.println("Please enter numbers only!!! Try again.");
                input.next();
            }
            finally{
                System.out.println("Your program will terminate now......");
            }
        }
    }
}