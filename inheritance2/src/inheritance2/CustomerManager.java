package inheritance2;
//Ýþ yapan sýnýflar somut sýnýf ve asla newlenmez. Sürdürülebilir olmaz
public class CustomerManager {
	public void add(Logger logger) {
		//Some add customer code
		System.out.println("added customer"); 
		logger.log();
	}
	

}
