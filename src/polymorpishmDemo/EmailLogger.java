package polymorpishmDemo;

public class EmailLogger extends BaseLogger{
	//override
	public void log(String message) {
		System.out.println("Logged to email : " + message);
	}
}
