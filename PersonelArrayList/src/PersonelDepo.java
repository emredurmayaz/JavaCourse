import java.util.ArrayList;
import java.util.Scanner;


public class PersonelDepo {
Scanner girdi=new Scanner(System.in);
	ArrayList<Personel> depo = new ArrayList<Personel>();
	public void yeniPersonelOlustur()
	{
		System.out.println("Personel Ad:");
		String pad=girdi.nextLine();
		
		System.out.println("Personel SoyAd:");
		String psoyad=girdi.nextLine();
		
		System.out.println("Personel Tckn:");
		String ptckn=girdi.nextLine();
		
		Personel per=new Personel(pad, psoyad, ptckn);
		
		depo.add(per);
	}
	
	
	public void personelListele(){
		
		System.out.printf("AD\tSOYAD\tTCKN\n");
		
		for(Personel personel: depo){
			System.out.printf("%s\t%s\t%s\t\n",personel.ad,personel.soyad,personel.getTckn());
			
		}
		
	}
	public Personel personelAra(String atckn)
	{
		Personel bulunan=null;
		for(Personel personel : depo){
			if(personel.getTckn().contains(atckn))
			{
				bulunan=personel;
				break;
			}
		}
		
		
		
		return bulunan;
	}
public void personelGuncelle(Personel pers)
{
	
	
}
	
	
}
