public class BasePlusCommissionEmployee extends CommetionEmployee {

    private double base ;

    public BasePlusCommissionEmployee(String name, String address, int ssn, Gender gender, double GrossSales, double commissionRate , double base) {
        super(name, address, ssn, gender, GrossSales, commissionRate);
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base){
        this.base = base;
    }

    @Override
    public double aernings() {
        return base+super.aernings() ;
    }

    @Override
    public void displayAllDetails (){
        super.displayAllDetails();
        displayEarnings();
    }

    @Override
    public void displayEarnings (){
        System.out.println("Earnings : "+aernings());
    }

}
