//practicing class1 but here we create separate files for for main class and student class

//Types of Constructors
public class Student{
    private int rollno;
    private String name;
    //Default constructor
    public Student(){
        rollno = 0;
        name = null;
    }
    //parameterized constructor
    public Student(int r , String n){
        rollno = r;
        name = n;
    }
    //copy constructor
    public Student(Student s){
        rollno = s.rollno;
        name = s.name;
    }
    //Setter Methods
    public void setrollno(int r){
        rollno = r;
    }
    public void setname(String n){
        name = n;
    }
    //Getter Methods
    public int getrollno(){
        return rollno;
    }
    public String getname(){
        return name;
    }
    //Print function
    public void print(){
        System.out.println("The rollno of the student is: "+getrollno());
        System.out.println("The name of the student is: "+getname());       
    }
        
}