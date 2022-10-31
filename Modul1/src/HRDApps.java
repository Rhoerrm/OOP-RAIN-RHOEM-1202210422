//import model.Employee;
//import model.Manager;

public class HRDApps {
    public static void main(String[] args) {
        Employee e = new Employee("Superman", 1); 

        e.setDepartmen("Finance");
        e.setSalary(15000);

        //Manager m1 = (Manager)m;
        e.displayEmployee();
    }
}

