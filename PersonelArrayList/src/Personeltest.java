import java.util.Scanner;
public class Personeltest {

	public static void main(String[] args) {
	Scanner girdi = new Scanner(System.in);
	PersonelDepo personelIsimleri = new PersonelDepo();
		int secenek=0;
		do {
			
			
			System.out.println("[1] yeni personel ekle");
			System.out.println("[2] personel listele");
			System.out.println("[3] personel ara");
			
			secenek=girdi.nextInt();
			
			if(secenek==1)
			personelIsimleri.yeniPersonelOlustur();
			else if (secenek==2)
			personelIsimleri.personelListele();
			else if(secenek==3)
			{
				Scanner gelen=new Scanner(System.in);
				System.out.println("[3] personel ara");
				String tc= gelen.nextLine();
		
			Personel aranan=personelIsimleri.personelAra(tc);
			if(aranan!=null)
			System.out.printf("Ad:%s \n Soyad:%d \n Tc: %s,",aranan.ad,aranan.soyad,aranan.getTckn());
			else
				System.out.println("aranan kiþi bulunamadý");
			}
			
		} while (secenek!=1);

	}

}
