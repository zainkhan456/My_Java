//Arithmetic Exception
//Exception Handling
//There are three main types of error i-e Syntax,Logical and Runtime errors.
import java.util.Scanner;
/*public class Test{
Here the result of division is infinity when we divide first number by 0.Which is correct.
    public static void main(String[] args){
        float a,b,result;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your First Number: ");
        a = input.nextFloat();
        System.out.print("Enter your Second number: ");
        b = input.nextFloat();
        result = a/b;
        System.out.println("The result of Division is " + result);
        System.out.println("Your program will terminate now...");
    }
}*/
/*public class Test{
//Here dividing number 1 by 0 will give an unexpected error i-e Arithmetic error which we will handle.
    //First We have to find the type and line of the error and then apply Try catch.
    public static void main(String[] args){
        int a,b,result;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your First Number: ");
        a = input.nextInt();
        System.out.print("Enter your Second number: ");
        b = input.nextInt();
        result = a/b;
        System.out.println("The result of Division is " + result);
        System.out.println("Your program will terminate now...");
    }
}*/
/*we can write both critical statements(Which have chances of expection) as well as not critical statements
  (mean normal statements) in try block.But Critical Statements must be written in try block.
*/
public class Test{
    public static void main(String[] args){
        int a,b,result;
        boolean repeat = true;
        Scanner input = new Scanner(System.in);
        while(repeat){
            System.out.println("Enter Your First Number: ");
            a = input.nextInt();
            System.out.println("Enter your Second number: ");
            b = input.nextInt();
        
                try{
                    result = a/b;
                    System.out.println("The result of Division is " + result);
                    repeat = false;
                }
                catch(ArithmeticException ae){
                    System.out.println("Please don not enter 0 as your denominator.Try again!!!");
                }
            }
        System.out.println("Your program will terminate now...");
    }
}