public class Employee {
    protected String name;
    protected int id;
    protected String department;
    protected int salary;

    public Employee(){
        
    }
    
    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void setDepartmen(String dept) {
        this.department = dept;
    }

    public void setSalary(int sal) {
        this.salary = sal;
    }

    

    public void displayEmployee(){
        System.out.println("nama : "+ this.name);
        System.out.println("Employee ID : " + this.id);
        System.out.println("department : "+ this.department);
        System.out.println("salary : "+ this.salary);
        System.out.println("==================================");
    }
}

