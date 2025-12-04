//main class
class test{
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student(26,"zain");
        Student s3 = new Student(s1);
        Student s4 = new Student(s2);
        System.out.println("Viewing details of Student s1: ");
        s1.print();
        System.out.println("Viewing details of Student s2: ");
        s2.print();
        System.out.println("Viewing details of Student s3: ");
        s3.print();
        System.out.println("Viewing details of Student s4: ");
        s4.print();
    }
}