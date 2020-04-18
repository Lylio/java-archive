
public class UGStudent extends Person {
	
	private String major;
	
	public UGStudent(String name, int birthYear, String major) {
		super(name, birthYear);
		setMajor(major);
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getMajor() {
		return major;
	}
	
	public String toString() {
	    return "Name: " + getName() + "\nYear of Birth: " + getBirthYear() + "\nMajor: " + major;
	}
	
	
}
