package homeworkDay3;
 

public class UserManager {
	
	//crud base
	
	public void add(User user) {  
		System.out.println("Added new user: " +user.getName());
	}
	
	public void delete(User user) {  
		System.out.println("Deleted user: " +user.getName());
	}
	
	public void update(User user) {  
		System.out.println("Updated user: " +user.getName());
	}

}

