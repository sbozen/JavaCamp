package interfaces;
//Loogeri smsLoggera uyarla
//Gerekli olan kodlarý yaz.
public class SmsLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Send sms to "+message);
		
		
	}

}
