import java.util.Scanner;


public class HacimHesaplaritest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HacimHesaplari hesapci = new HacimHesaplari();
 Scanner girdi=new Scanner(System.in);
 System.out.println("kürenin yarý capýný gir :");
 double yariCap = girdi.nextDouble();
 double sonuc=hesapci.kureHacim(yariCap);
 System.out.printf("%f yaricapli kurenin hacmi %f",yariCap,sonuc);
 //prizma hacmi 
 
 HacimHesaplari hesap1 = new HacimHesaplari();

 System.out.println("degerleri girin :");
 int k = girdi.nextInt();
 int l = girdi.nextInt();
 int m = girdi.nextInt();
 int sonuc1 = hesap1.prizmaHacim(k,l,m);
 System.out.printf("%d,%d,%d dgerli prizmanin hacmi %d dir",k,l,m,sonuc1);
	}

}
