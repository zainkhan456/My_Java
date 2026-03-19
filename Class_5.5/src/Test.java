//Multiple Exception Handling i-e 
//ArithmeticException,InputMismatchExceptionand ArrayIndexOutOfBoundException.

import java.util.Scanner;
import java.util.InputMismatchException;
public class Test{
    public static void main(String[] args){
        int a,b,result,index;
        int arr[] = new int[5];
        Scanner input = new Scanner(System.in);
        boolean repeat = true;
        while(repeat)
        {
        try
        {
            System.out.println("Enter your first number: ");
            a = input.nextInt();
            System.out.println("Enter your second number: ");
            b = input.nextInt();
            result = a/b;
            System.out.println("Enter the index of the array to store the result");
            index = input.nextInt();
            arr[index] = result;
            System.out.println("The result of division is equal to " + arr[index]);
            repeat = false;
        }
        catch(InputMismatchException ime)
        {
            System.out.println("Enter numbers only!!! Try again.");
            input.next();
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Donot Divide by zero!!! Try again.");
        }
        catch(ArrayIndexOutOfBoundsException be)
        {
            System.out.println("Invalid Index,the location of array doesn't exist!!! Try again.\nEnter index between 0 and 4 only");
        }
        }
    }
}