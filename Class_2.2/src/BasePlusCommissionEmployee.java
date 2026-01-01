//Child class of CommissionEmployee
class BasePlusCommissionEmployee extends CommissionEmployee{
    private double basicSalary;
    public BasePlusCommissionEmployee(String f,String l,double r,double s,double bs){
        super(f,l,r,s);
        basicSalary = bs;
    }
    public double getSalary(){
        return basicSalary + super.getSalary();
    }
    public String toString(){
        String n = super.toString();
        return n + "\nBasic salary = "+ basicSalary;
    }
    
}