package homeworkDay2;


public class Main {

	public static void main(String[] args) {
		Courses course1 = new Courses(1,"C# Angular");
		Courses course2=new Courses(2,"Java React");
		Courses course3=new Courses(3,"Programming");
		
		
				
		CourseManager courseManager=new CourseManager();
		courseManager.signUp (course1);
		courseManager.signUp (course2);
		
		TeacherManager teacher1=new TeacherManager();
		teacher1.addCourse(course3);
		teacher1.update(course1);
		teacher1.delete(course3);
		

	}

}
