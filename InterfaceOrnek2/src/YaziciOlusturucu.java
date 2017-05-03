
public class YaziciOlusturucu {
private Yazici bilinmeyenYazici;

public Yazici getBilinmeyenYazici() {
	return bilinmeyenYazici;
}

public void setBilinmeyenYazici(Yazici bilinmeyenYazici) {
	this.bilinmeyenYazici = bilinmeyenYazici;
}
public void yazmaIslemiYap()
{
	
	bilinmeyenYazici.yazdir();
}


}
