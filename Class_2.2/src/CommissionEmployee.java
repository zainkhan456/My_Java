public class CommissionEmployee extends Employee{
    protected double sales;
    protected double rate;
    public CommissionEmployee(String f,String l,double r,double s){
        super(f,l);
        rate = r;
        sales = s;       
    }
    public double getsales(){
        return sales;
    }
    public double getrate(){
        return rate;
    }
    public double getSalary(){
        return getrate() * getsales();
    }
    public String toString(){
        String n = super.toString();
        return n + "\nCommission Rate = " + getrate() + "\nGross Sales = " + getsales();
    }
}