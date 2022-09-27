package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
KrediUI krediUI=new KrediUI();
OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
krediUI.kredihesapla(ogretmenKrediManager);
krediUI.kredihesapla(new AskerKrediManager());
		
		
	}

}
