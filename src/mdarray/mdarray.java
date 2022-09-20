package mdarray;

public class mdarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[][] sehirler = new String [3][3];
sehirler[0][0]="istanbul";
sehirler[0][1]="adana";
sehirler[0][2]="mersin";
sehirler[1][0]="bursa";
sehirler[1][1]="kırklareli";
sehirler[1][2]="izmir";
sehirler[2][0]="çanakkale";
sehirler[2][1]="tekirdag";
sehirler[2][2]="edirne";

for (int i = 0; i <= 2; i++) {
	System.out.println("--------------------------");
	for (int j = 0; j <= 2; j++) {
		System.out.println(sehirler[i][j]);
	}
}
	}

}
