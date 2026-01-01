//Inheritance example
//parent class
public abstract class Employee{
    protected String firstName;
    protected String lastName;
    public Employee(String f,String l){
        firstName = f;
        lastName = l;
    }
    public abstract double getSalary();
    public String toString(){
        return "First Name = " + firstName + "\nLast Name = " + lastName;
    }
}
