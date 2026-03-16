//InputMismatchException.
//When user input wrong value e.g user input string value instead of an integer value.
import java.util.Scanner;
import java.util.InputMismatchException;

public class Test{
    public static void main(String[] args){
        int a,b,result;
        boolean repeat = true;
        Scanner input = new Scanner(System.in);
        while(repeat){
        try{
        System.out.println("Enter Your First Number: ");
        a = input.nextInt();
        System.out.println("Enter your Second number: ");
        b = input.nextInt();
        result = a+b;
        System.out.println("The result of addition is " + result);
        repeat = false;
        }
        catch(InputMismatchException ime){
            System.out.println("Please enter your number in integer!!!.Try Again.");
            input.next();//Used for new input.
            }
        }
        System.out.println("Your program will terminate now...");
    }
}


    