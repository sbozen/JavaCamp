package inheritance2;
//�� yapan s�n�flar somut s�n�f ve asla newlenmez. S�rd�r�lebilir olmaz
public class CustomerManager {
	public void add(Logger logger) {
		//Some add customer code
		System.out.println("added customer"); 
		logger.log();
	}
	

}
