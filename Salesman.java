public class Salesman extends Employee {
    private String salesArea;
    private String productName;
    private int managerId;

    Salesman(int employeeId,String employeeName,double salary, String salesArea,String productName, int managerId){
        System.out.println("parameterized Constructor Called from Salesman");
        setEmployeeId(employeeId);
        setEmployeeName(employeeName);
        setSalary(salary);
        setSalesArea(salesArea);
        setProductName(productName);
        setManagerId(managerId);
    }

    void showSalesmanDetails(){
        System.out.println("Salesman Details");
        showEmployeeDetails();
        System.out.println("SALES AREA: "+ getSalesArea());
        System.out.println("PRODUCT NAME: "+ getProductName());
        System.out.println("MANAGER ID: "+ getManagerId());
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSalesArea() {
        return salesArea;
    }

    public void setSalesArea(String salesArea) {
        this.salesArea = salesArea;
    }
}