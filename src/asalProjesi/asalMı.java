package asalProjesi;

import java.util.Scanner;

public class asalM� {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Asall���n� kontrol etmek istedi�iniz sayiyi giriniz: ");
int number=scan.nextInt();
if(number==1 || number==0) {
	System.out.println(number+ " Sayisi asal de�ildir");
}else {
	int i=number/2;
	boolean asalMi=true;
	while(i>1) {
		if(number%i==0) {
			asalMi=false;
			break;
		}
		i--;
	}
	if(asalMi) {
		System.out.println(number + " sayisi asaldir");
	}else {
		System.out.println(number +" asal de�ildir!");
	}
}

	}

}
