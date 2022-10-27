class Manager extends Employee {
    private String teritoryName;

    Manager(int employeeId, String employeeName, double salary, String teritoryName) {
        System.out.println("parameterized Constructor Called from Manager");
        setEmployeeId(employeeId);
        setEmployeeName(employeeName);
        setSalary(salary);
        setTeritoryName(teritoryName);
    }

    void showManagerDetails() {
        System.out.println("Manager Details");
        showEmployeeDetails();
        System.out.println("TERITORY: " + getTeritoryName());
    }

    void incrementSalary(Salesman s, int amount) {
        if (s.getManagerId() == getEmployeeId()) {
            double salary = s.getSalary() + amount;
            s.setSalary(salary);
        }
    }

    public String getTeritoryName() {
        return teritoryName;
    }

    public void setTeritoryName(String teritoryName) {
        this.teritoryName = teritoryName;
    }
}
