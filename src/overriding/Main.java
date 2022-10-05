package overriding;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
	System.out.println(ogretmenKrediManager.hesapla(1000));
 */
	BaseKrediManager [] krediManagers=new BaseKrediManager[] 
			{new OgretmenKrediManager(),new TarimKrediManager(),new OgrenciKrediManager()};	
	
	for(BaseKrediManager kredimanager :krediManagers) {
		
		System.out.println(kredimanager.hesapla(1000));
	}
	}

}
