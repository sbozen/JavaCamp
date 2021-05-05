package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers= {new SmsLogger(),new EmailLogger(), new FileLogger()};
		
		CustomerManager customerManager=new CustomerManager( loggers);
		
		Customer person1=new Customer(1,"S�d�ka B��ra","�ZEN");
		
		customerManager.add(person1);

	}

}
