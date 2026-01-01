//Abstract class
//having an abstract method (or pure virtual method)
//incomplete class
//we can't create it's object but we can make it's reference variable
//It's abstract method must be define in it's child class
abstract class Figure{
    double dim1;
    double dim2;
    Figure(double a,double b){
        dim1 = a;
        dim2 = b;
    }
    public abstract double area();
}
class Rectangle extends Figure{
    Rectangle(double a,double b){
        super(a,b);
    }
    public double area(){
        System.out.println("Inside the area method of rectangle class");
        return dim1 * dim2;
    }
}
class Triangle extends Figure{
    Triangle(double a,double b){
        super(a,b);
    }
    public double area(){
        System.out.println("Inside the area method of Triangle class");
        return (dim1 * dim2) / 2;
    }
}
public class Test{
    public static void main(String[] args){
        Figure ref;
        Rectangle r = new Rectangle(9,4);
        Triangle t = new Triangle(10,8);
        ref = r;
        System.out.println(ref.area());
        ref = t;
        System.out.println(ref.area());
    }
}