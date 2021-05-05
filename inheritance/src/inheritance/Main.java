package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer person=new IndividualCustomer();
		person.id=1;
		person.customerNumber="111";
		person.firstName="Sýdýka Büþra";
		person.lastName="ÖZEN";
		person.nationalIdentity="10000000000";
		
		 
		CorporateCustomer company=new CorporateCustomer();
		company.id=2;
		company.customerNumber="222";
		company.companyName="HepsiBurada";
		company.taxNumber="11111";
		
		CustomerManager customerManager=new CustomerManager();
		///customerManager.add(company);
		//customerManager.add(person);
		
		Customer[] customers= {person,company};
		customerManager.addMultiple(customers);
		
		
	}

}
