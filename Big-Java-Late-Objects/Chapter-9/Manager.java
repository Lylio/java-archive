
public class Manager extends Employee {
	
	private String department;
	
	public Manager(String name, int salary, String department) {
		super(name, salary);
		setDepartment(department);
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public String toString() {
		return super.toString() + "\nDepartment: " + getDepartment();
	}

}
