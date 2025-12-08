//Read String value from user
import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        String name1,name2;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your name: ");
        //This can read input with spaces
        name1 = s.nextLine();
        System.out.println("Your name is \n"+name1);
        
        System.out.println("Enter Your name: ");
        //This can't read input with spaces
        name2 = s.next();
        System.out.println("Your name is \n"+name2);
    }
}