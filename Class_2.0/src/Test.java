//Example of dynamic method dispatch
//Calculating area of different figures

class Figure{
    double dim1;
    double dim2;
    Figure(double a,double b){
        dim1 = a;
        dim2 = b;
    }
    public double area(){
        System.out.println("Area for figure is undefined");
        return 0;
    }
    
}
class Rectangle extends Figure{
    Rectangle(double a,double b){
        super(a,b);
    }
    //override area for rectangle
    public double area(){
        System.out.println("Inside area method for rectangle");
        return dim1 * dim2;
    }
}
class Triangle extends Figure{
    Triangle(double a,double b){
        super(a,b);
    }
    //override area for Triangle
    public double area(){
        System.out.println("Inside area method for triangle");
        return (dim1 * dim2)/2;
    }
}
public class Test{
    public static void main(String[] args){
        Figure f = new Figure(10,10);
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        Figure ref;
        ref = f;
        System.out.println(f.area());
        ref = r;
        System.out.println(ref.area());
        ref = t;
        System.out.println(ref.area());
        
    }
}