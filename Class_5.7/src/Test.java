//Creating a general catch block

import java.util.Scanner;
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
            catch(Exception e){
                System.out.println("Inalid Input");
                System.out.println(e);
                input.next();
            }
            
        }
    }
}