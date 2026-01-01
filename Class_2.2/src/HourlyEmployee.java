public class HourlyEmployee extends Employee{
    private double rate;
    private double hours;
    public HourlyEmployee(String f,String l,double r,double h){
        super(f,l);
        rate = r;
        hours = h;
    }
    public double getRate(){
        return rate;
    }
    public double getHours(){
        return hours;
    }
    public double getSalary(){
        double salary = 0;
        if(hours < 40){
            salary = getRate() * getHours();
        }
        else
            salary = (getRate() * getHours()) + (getHours() - 40) * getRate() * 1.5;
        return salary;
    }
    public String toString(){
        String n = super.toString();
        return n + "\nHourly Rate = " + getRate() +"\nHours Worked= "+ getHours();
    }
        
}