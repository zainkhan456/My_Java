public class Test{
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.display();
        e1.toString();//Here the string is returned by the toString method of the Employee class but we have not display it yet.
        System.out.println(e1.toString());
        Employee e2 = new Employee(120,"Asim kamal");
        e2.display();
        System.out.println(e2.toString());
        Teacher t1 = new Teacher();
        t1.display();
        System.out.println(t1.toString());
        Teacher t2 = new Teacher(110,"Faisal","PHD");
        t2.display();
        System.out.println(t2.toString());
        System.out.println("*************************************");
        System.out.println("Second Method to call toString method ");
        System.out.println(t2); //work same as system.out.println(t2.toString());
        
    }
}