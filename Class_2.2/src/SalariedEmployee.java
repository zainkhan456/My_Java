public class SalariedEmployee extends Employee{
    private double salary;
    public SalariedEmployee(String f,String l,double s){
        super(f,l);
        salary = s;
    }
    public double getSalary(){
        return salary;
    }
    public String toString(){
        String n = super.toString();
        return n + "\nSalary of Employee = " + salary;
    }
    
}