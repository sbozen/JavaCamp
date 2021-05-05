package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers= {new SmsLogger(),new EmailLogger(), new FileLogger()};
		
		CustomerManager customerManager=new CustomerManager( loggers);
		
		Customer person1=new Customer(1,"Sýdýka Büþra","ÖZEN");
		
		customerManager.add(person1);

	}

}
