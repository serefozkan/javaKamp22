package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee employee= new Employee();
Customer customer=new Customer();

EmployeeManager employeeManager=new EmployeeManager();
CustomerManager customerManager=new CustomerManager();
employeeManager.BestEmployee();
	}

}
