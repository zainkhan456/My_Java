import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);        
        System.out.println("Enter the first name of the salried employee");
        String fn = input.nextLine();
        System.out.println("Enter the last name of the salried employee ");
        String ln = input.nextLine();
        System.out.println("enter the salary of the salaried employee");
        int s = input.nextInt();
        SalariedEmployee s1 = new SalariedEmployee(fn,ln,s);
        CommissionEmployee c1 = new CommissionEmployee("zain"," khan",50,1000);
        HourlyEmployee h1 = new HourlyEmployee("Asim"," kamal",100,10);
        BasePlusCommissionEmployee bp = new BasePlusCommissionEmployee("Ali","khan",50,1000,20000);
        System.out.println("Details of salaried employee");
        System.out.println(s1.toString());
        System.out.println("Total salary = " + s1.getSalary());
        System.out.println("Details of commissioned employee");
        System.out.println(c1.toString());
        System.out.println("Total salary = "+ c1.getSalary());
        System.out.println("Details of Hourly employee");
        System.out.println(h1.toString());
        System.out.println("Total salary = "+ h1.getSalary());
        System.out.println("Details of base plus commission employee");
        System.out.println(bp.toString());
        System.out.println("Total salary = "+ bp.getSalary());       
    }
}