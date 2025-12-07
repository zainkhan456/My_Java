//Console Input And Output Program using scanner class
//Reading integer value from user

import java.util.Scanner;
public class Input{
    public static void main(String[] args){
        int a,b,sum;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your First number: ");
        a = input.nextInt();
        System.out.println("Enter Your Second Number: ");
        b = input.nextInt();
        sum = a + b;
        System.out.println("The sum of "+a+" and "+b+" is "+sum);
    }
}
