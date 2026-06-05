public class CommetionEmployee extends Employee implements Displayable{

    private double GrossSales;
    private double commissionRate;

    public CommetionEmployee(String name , String address , int ssn , Gender gender , double GrossSales , double commissionRate ) {
        super(name, address, ssn, gender);
        this.commissionRate = commissionRate;
        this.GrossSales = GrossSales;
    }

    public double getGrossSales(){
        return GrossSales;
    }

    public void setGrossSales(double GrossSales){
        this.GrossSales = GrossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString(){
        return "CommetionEmployee{" +
                "GrossSales=" + GrossSales +
                ", commissionRate=" + commissionRate +
                '}';
    }

    @Override
    public double aernings(){
        return GrossSales * commissionRate;
    }

    public void displayAllDetails (){
        System.out.println(super.toString());
        System.out.println(toString());
    }
    public void displayEarnings (){
        System.out.println("Earnings : "+aernings());
    }

}
