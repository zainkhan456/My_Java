public class Teacher extends Employee{
    private String qualification;
    //when the default constructor of the Teacher is called so it will first call the default constructor of 
    //the parent class before executing the other statements in it.
    public Teacher(){
        qualification = "Nothing";
    }
    public Teacher(int i,String n,String q){
        super(i,n);//super keyword call the parent class constructor
        qualification = q;
    }
    public void display(){  //here we are redefining the display function-->so method overriding
     System.out.println("Inside the display method of teacher class(child class)");
     super.display();//call the display function of the parent class
     System.out.println("The qualification of the employee is " + qualification);
    }
    public String toString(){//Again method overriding
        System.out.println("Inside the toString method of the teacher class");
        String st = super.toString();
        return st + "\nQualification of the employee is " + qualification;
    }
}