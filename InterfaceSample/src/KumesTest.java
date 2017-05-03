
public class KumesTest {

	public static void main(String[] args) {
		Kumes km=new Kumes();
		Ordek o1=new Ordek(1);
        km.kumeseElemanEkle(o1);
        Ordek o2=new Ordek(2);
        km.kumeseElemanEkle(o2);
        Ordek o3=new Ordek(3);
        km.kumeseElemanEkle(o3);
        
        Tavuk t1=new Tavuk(1);
        km.kumeseElemanEkle(t1);
        Tavuk t2=new Tavuk(2);
        km.kumeseElemanEkle(t2);
        Tavuk t3=new Tavuk(3);
        km.kumeseElemanEkle(t3);
        km.listele();
	}

}
