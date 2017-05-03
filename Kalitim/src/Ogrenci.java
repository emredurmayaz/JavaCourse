
public class Ogrenci extends Insan {

	public Ogrenci(String ad, String soyad) {
		super(ad, soyad);
		
	}
	
	public void selamVer()
	{
		
		System.out.println("Merhaba Ogrenci "+ad +" "+soyad);
	}
   public void Konus()
   {
	   System.out.println("Ogrenci Konusuyor");
	   
   }
}
