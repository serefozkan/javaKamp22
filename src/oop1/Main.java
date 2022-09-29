package oop1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String mesaj="vade oraný";

Product product1=new Product();
product1.setName("delonghi kahve makinesi");
product1.setDiscount(7);
product1.setUnitPrice(7500);
product1.setUnitsInStock(3);
product1.setImageUrl("image1.jpg");

Product product2=new Product();
product2.setName("smeg kahve makinesi");
product2.setDiscount(7);
product2.setUnitPrice(7500);
product2.setUnitsInStock(3);
product2.setImageUrl("image2.jpg");

Product product3=new Product();
product3.setName("kitchen kahve makinesi");
product3.setDiscount(7);
product3.setUnitPrice(7500);
product3.setUnitsInStock(3);
product3.setImageUrl("image3.jpg");
	

Product products[]= {product1,product2,product3};	
for (Product product : products) {
System.out.println(product.getName());	
}	
	}

}
