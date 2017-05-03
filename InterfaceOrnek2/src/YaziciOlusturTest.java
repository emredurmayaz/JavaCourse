
public class YaziciOlusturTest {

	public static void main(String[] args) {
		LazerYazici lyz=new LazerYazici();
        YaziciOlusturucu olusturucu=new YaziciOlusturucu();
        
        olusturucu.setBilinmeyenYazici(lyz);
        olusturucu.yazmaIslemiYap();
	}

}
