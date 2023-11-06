package boattracker;

public class Employee {
    private int empId;
    private String department;
    private String name;

    public Employee(int employeeId, String department) {
        this.empId = employeeId;
        this.department = department;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return this.department;
    }
}
