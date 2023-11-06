package boattracker;
import java.util.ArrayList;

public class Employee {
    private int empId;
    private String department;
    private String name;
    private ArrayList<Boat> boats = new ArrayList<Boat>();

    public Employee(int employeeId, String department) {
    this.empId = employeeId;
    this.department = department;

    public String getName() {
	return this.name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getDepartment() {
	return this.department;
    }

    public void addBoat(Boat boat){
	this.boats.add(boat);
	boat.addUser(this);
    }
	
}
