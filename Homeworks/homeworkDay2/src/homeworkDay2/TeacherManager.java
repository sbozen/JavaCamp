package homeworkDay2;

public class TeacherManager {
	public void addCourse(Courses course) {
		System.out.println("Added new course: "+course.courseName);
	}
	
	public void update(Courses course) {
		System.out.println("Updated course: "+course.courseName);
	}
	
	public void delete(Courses course) {
		System.out.println("Deleted course: "+course.courseName);
	}

}
