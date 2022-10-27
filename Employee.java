public class Employee {
    protected int employeeId;
    protected String employeeName;
    protected double salary;

    
    Employee(){
        System.out.println("Empty Constructor Called from Employee");
    }

    
    Employee(int employeeId,String employeeName,double salary){
        System.out.println("parameterized Constructor Called from Employee");
        setEmployeeId(employeeId);
        setEmployeeName(employeeName);
        setSalary(salary);
        showEmployeeDetails();
    }

     void showEmployeeDetails(){
         System.out.println("ID: "+getEmployeeId());
         System.out.println("NAME: "+getEmployeeName());
         System.out.println("SALARY: "+getSalary());
     }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

   
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

   
}