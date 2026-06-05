import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Department d1 = new Department(1,"oop");

        SalaridEmployee se1= new SalaridEmployee(10000 , 1000 , 300 , "Ali" , "cairo" , 1200 , Gender.male );

        d1.addEmployee(se1);

        CommetionEmployee ce1 = new CommetionEmployee("Ahmed" , "cairo",2000 , Gender.male ,20000 , 0.4   ) ;

        d1.addEmployee(ce1);

        HourlyEmployee he1 = new HourlyEmployee(100 , 6 , "Mona" , "cairo" , 2000 ,  Gender.female );

        d1.addEmployee(he1);
        System.out.println("-------------------------------------------------");

        System.out.println(d1.getEmployeeCount());

        System.out.println("-------------------------------------------------");
        d1.printBasicData();

        System.out.println("-------------------------------------------------");
        d1.printAllData();

        System.out.println("-------------------------------------------------");
    }
}