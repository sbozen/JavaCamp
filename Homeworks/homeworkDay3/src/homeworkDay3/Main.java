package homeworkDay3; 

public class Main {

	public static void main(String[] args) {  
		 
		Student student1=new Student(1, "Sıdıka Büşra", "ÖZEN", "sbusraozen@gmail.com", "Computer Engineer"); 
		Instructor instructor1=new Instructor(1, "Engin", "DEMİROĞ", "engindemirog@gmail.com");
		 
		StudentManager studentManager=new StudentManager();
		studentManager.add(student1);
		studentManager.update(student1);
		studentManager.delete(student1);
		studentManager.signUp ("Java");
		studentManager.signUp ("React\n"); 
		
		InstructorManager instructorManager =new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.update(instructor1);
		instructorManager.delete(instructor1);
		instructorManager.remove();
		
				
	}

}
