package polymorpishmDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * EmailLogger logger=new EmailLogger();
logger.log("log mesaji");


BaseLogger [] loggers=new BaseLogger[] {new FileLogger(),new DatabaseLogger(),new EmailLogger()};
for (BaseLogger logger : loggers) {
	logger.log("log mesaji");
}
*/
	
	CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
	customerManager.add();
	CustomerManager customerManager2=new CustomerManager(new FileLogger());
	customerManager2.add();
	}
}
