//Har wo file jis mai java ka source code parha hotha hai us ke class aur file ka name same hoga 
//jis class ke andhar main function hoga,us class ko main class kehte hai.
//there can be multiple classes in a file but srf wo file public hogi jis ka name file ke name pr ho.
class Student{
    private int rollNumber;
    private String studentName;
    //Default Constructor
    public Student(){
        rollNumber = 0;
        studentName = "Empty";
    }
    //Parameterized Constructor
    public Student(int r,String n){
        rollNumber = r;
        studentName = n;
    }
    //Copy Constructor
    public Student(Student s){
        rollNumber = s.rollNumber;
        studentName = s.studentName;
    }
    //setter methods
    public void setName(String n){
        studentName = n;
    }
    public void setRollno(int r){
        rollNumber = r;
    }
    //getter methods
    public String getName(){
        return studentName;
    }
    public int getrollno(){
        return rollNumber;
    }
    public void print(){
        System.out.println("The name of the student is: "+studentName );
        System.out.println("The rollno of the student is: "+rollNumber);
    }
}
public class Program1 { 
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.print();
        Student s2 = new Student(26,"Zain ul islam");
        s2.print();
        Student s3 = new Student(s2);
        s3.print();
    }
    
}
