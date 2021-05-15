package homeworkDay3;

public class Student extends User {   
	private String department;
	


	public Student(int id, String name, String lastName, String email, String department) {
		super(id, name, lastName, email);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
 
 

}
