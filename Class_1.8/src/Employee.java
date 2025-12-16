//Inheritance

//parent class
/*Object is the parent class in java programming from which all other child classes (built-in) are derrived
  and it is the only class which has no parent class in java */

  public class Employee{   
    protected int id;
    protected String Empname;
    public Employee(){
        id = 0;
        Empname = "not set";
    }
    public Employee(int i,String n){
        id = i;
        Empname = n;
    }
    public int getID(){
        return id;
    }
    public void setID(int i){
        id = i;
    }
    public String getName(){
        return Empname;
    }
    public void setname(String n){
        Empname = n;
    }
    public void display(){
     System.out.println("Inside the display function of the Employee class ");
     System.out.println("Employee Id is "+getID());
     System.out.println("Employee name is "+getName());
    }
    /*toString is not the function or method of the employee class rather this method
      is in or define in the Object class of java and here we are over-riding this method.
      let me explain how ----> As toString method is now in the employee class and bydefault 
      the parent class of the Employee class at this time is the Object class and we are redefining
      the toString method in the child class i-e Employee class which is already define in its parent
      class i-e Object */
    public String toString(){
        System.out.println("Inside the toString() method of employee class");
        return "ID of the employee is " + getID() + "\nThe name of the employee is " + getName();
    }
}