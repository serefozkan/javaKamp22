package bankaOOP1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
IndividualCustomer individualCustomer=new IndividualCustomer();
individualCustomer.setId(1);
individualCustomer.setPhone("05222222222");
individualCustomer.setCustomerNumber("1234");
individualCustomer.setFirstName("Engin");
individualCustomer.setLastName("Demirog");
	
CorporateCustomer corporateCustomer	=new CorporateCustomer();
corporateCustomer.setId(2);
corporateCustomer.setCompanyName("kodlama.io");
corporateCustomer.setPhone("0533333333");
corporateCustomer.setTaxNumber("111111");
corporateCustomer.setCustomerNumber("54321");

Customer[] customers= {individualCustomer,corporateCustomer};
for (Customer customer : customers) {
	System.out.println(customer.getId());
}	
	}

}
