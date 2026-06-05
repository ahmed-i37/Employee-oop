import java.util.ArrayList;

public class Department {

    int departmentNo;
    String departmentName;

    ArrayList <Employee> employeesList;

    public Department(){}
    public Department(int departmentNo, String departmentName){
        this.departmentNo = departmentNo;
        this.departmentName = departmentName;
        employeesList = new ArrayList<Employee>();
    }

    public int getDepartmentNo() {
        return departmentNo;
    }

    public void setDepartmentNo(int departmentNo) {
        this.departmentNo = departmentNo;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void addEmployee(Employee e){
        employeesList.add(e);
    }

    public void removeEmployee(int indx){
        employeesList.remove(indx);
    }

    public int getEmployeeCount(){
        return employeesList.size();
    }

    public void printBasicData(){
        for(int i=0;i<employeesList.size();i++){
            System.out.println(employeesList.get(i).getSsn() + " " + employeesList.get(i).getName());
        }
    }

    public void printAllData(){
        for(int i=0;i<employeesList.size();i++){
            if(employeesList.get(i) instanceof SalaridEmployee){
                ((SalaridEmployee) employeesList.get(i)).displayAllDetails();
            }
            if(employeesList.get(i) instanceof CommetionEmployee){
                ((CommetionEmployee) employeesList.get(i)).displayAllDetails();
            }
            if(employeesList.get(i) instanceof HourlyEmployee){
                ((HourlyEmployee) employeesList.get(i)).displayAllDetails();
            }

        }
    }
}
