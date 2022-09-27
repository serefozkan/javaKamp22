package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product urun = new Product(13, "adana");
		//urun.setName("Laptop");
		//urun.setId(1);
		Product urun2=new Product();
		urun2.setName("masa ");
		ProductManager productManager = new ProductManager();
		productManager.Add(urun2);

//System.out.println(urun.getKod());	
	}

	
	
	
}
