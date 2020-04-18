
public class Instructor extends Person {
	
	private int salary;
	
	public Instructor(String name, int birthYear, int salary) {
		super(name, birthYear);
		setSalary(salary);
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public String toString() {
	    return "Name: " + getName() + "\nYear of Birth: " + getBirthYear() + "\nSalary: " + salary;
	}
	
}
