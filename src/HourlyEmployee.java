public class HourlyEmployee extends Employee implements Displayable{

    private double hourRate;
    private int noOfHours;

    public HourlyEmployee(double hourRate, int noOfHours , String name, String address, int ssn, Gender gender) {
        super(name, address, ssn, gender);
        this.hourRate = hourRate;
        this.noOfHours = noOfHours;
    }

    public double getHourRate(){
        return hourRate;
    }

    public void setHourRate (double hourRate){
        this.hourRate = hourRate;
    }

    public int getNoOfHours() {
        return noOfHours;
    }

    public void setNoOfHours(int noOfHours) {
        this.noOfHours = noOfHours;
    }
    @Override
    public double aernings(){
        return hourRate * noOfHours;
    }

    public void displayAllDetails (){
        System.out.println(super.toString());
        System.out.println(toString());
    }
    public void displayEarnings (){
        System.out.println("Earnings : "+aernings());
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourRate=" + hourRate +
                ", noOfHours=" + noOfHours +
                '}';
    }

}
