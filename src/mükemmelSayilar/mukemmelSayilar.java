package m�kemmelSayilar;

public class mukemmelSayilar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number=5;
int total=0;
for (int i = 1; i <number; i++) {
	if(number%i==0) {
		total+=i;
	}
}
if (total==number) {
	System.out.println("m�kemmel sayidir");
}else {
	System.out.println("m�kemmel sayi degildir");
	}
	}
}
