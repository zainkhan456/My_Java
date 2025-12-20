//Dynamic method dispatch
//It mean that which overrided method should be call in different sitiuation or conditions

class A{
    public A(){
        
    }
    public void callMe(){
        System.out.println("Inside the callMe() method of class A");
    }
}
class B extends A{
    public B(){
        
    }
    public void callMe(){
        System.out.println("inside the callMe() method of class B");
    }
}
class C extends A{
    public C(){
        
    }
    public void callMe(){
        System.out.println("Inside the callMe() method of class C");
    }
}
public class Test{
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();
        A ref;
        ref = a;
        a.callMe();
        ref = b;
        b.callMe();
        ref = c;
        c.callMe();
        
    }
}