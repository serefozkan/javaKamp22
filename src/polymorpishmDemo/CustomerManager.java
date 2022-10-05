package polymorpishmDemo;
public class CustomerManager {

private BaseLogger logger;	
public CustomerManager(BaseLogger logger) {
//calistigin loggeri soyle
	this.logger=logger;
}
//we are working with baselogger.

	public void add() {
	 System.out.println("Musteri eklendi");
	 this.logger.log("log mesaji"); 
 }
}
