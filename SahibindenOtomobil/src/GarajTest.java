import java.util.ArrayList;


public class GarajTest {

	public static void main(String[] args) {
		
	Garaj benimGaraj=new Garaj();
	garajOlustur(benimGaraj);
	Araba arananAraba=new Araba(Marka.FORD,"fiesta","hatchback",2015,"F123456789","beyaz",30.000,20000);
	
	ArrayList<Araba> liste=benimGaraj.aracGetir(arananAraba);
	for (Araba araba : liste) {
		System.out.printf("Marka %s Model %d",araba.getMarka(),araba.getModel());
		
	}
	}
	
	public static void garajOlustur(Garaj g)
	{
		Araba araba1=new Araba(Marka.FORD,"fiesta","hatchback",2015,"F123456789","beyaz",30.000,20000);
		Araba araba2=new Araba(Marka.RENAULT,"symbol","sedan",1999,"F1234567","mavi",20000,16000);
		Araba araba3=new Araba(Marka.VOLKSWAGEN,"Passat","sedan",2015,"F123456759","siyah",120000,20000);
		Araba araba4=new Araba(Marka.FIAT,"egea","hatchback",2017,"F123456989","kırmızı",70000,16000);
		
		g.aracEkle(araba1);
		g.aracEkle(araba2);
		g.aracEkle(araba3);
		g.aracEkle(araba4);
	}


}
