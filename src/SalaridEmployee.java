public class SalaridEmployee extends Employee implements Displayable {
    double salary;
    double bonus;
    double deduction;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public double getDeduction() {
        return deduction;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    public SalaridEmployee() {}

    public SalaridEmployee(double salary, double bonus, double deduction ,String name , String address , int ssn , Gender gender) {
        super(name,address,ssn,gender);
        this.salary = salary;
        this.bonus = bonus;
        this.deduction = deduction;
    }

    @Override
    public double aernings(){
        return (salary+bonus)-deduction;
    }

    public void displayAllDetails (){
        System.out.println(super.toString());
        System.out.println(toString());

    }
    public void displayEarnings (){
        System.out.println("Earnings : " + aernings());
    }

    @Override
    public String toString(){
        return "SalaridEmployee{" +
                "salary=" + salary +
                ", bonus=" + bonus +
                ", deduction=" + deduction +
                '}';
    }
}
