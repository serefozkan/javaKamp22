package switchProje;

public class switchProje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';
		switch (grade) {

		case 'A':

			System.out.println("mükemmel geçtiniz");
			break;
		case 'B':

			System.out.println("çok güzel geçtiniz");
			break;
		case 'C':

			System.out.println("iyi geçtiniz");
			break;
		case 'D':

			System.out.println("fena deðil geçtiniz");
			break;
		case 'F':

			System.out.println("kaldýnýz");
			break;
default:
	System.out.println("geçersiz not girdisi");
		}
	}
}
