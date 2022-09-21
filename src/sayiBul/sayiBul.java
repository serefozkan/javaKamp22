package sayiBul;

import java.util.Scanner;

public class sayiBul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int [] sayilar = new int [] {1,2,5,7,9,0};
		System.out.println("Aramak istediginiz sayiyi giriniz: ");
		boolean varMi=false;
		int aranacak=scan.nextInt();
		for (int i = 0; i < sayilar.length; i++) {
			if(aranacak==sayilar[i]) {
				System.out.println(aranacak+" sayisi " + i + ". indiste bulundu.");
				varMi=true;
				break;
			}
			
		}
		if(varMi==false) {
			System.out.println("Boyle bir sayi bu dizide mevcut degil.");

		}
	}

}
