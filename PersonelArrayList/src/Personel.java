
public class Personel {
public String ad;
public String soyad;
private String tckn;
public Personel(String ad, String soyad , String tckn)
{
	this.ad=ad;
	this.soyad=soyad;
	setTckn(tckn);
}
public String getTckn() {
	return tckn;
}
public void setTckn(String tckn) {
	
if(tckn.length()!=11)
	this.tckn = "hata";
else
	this.tckn = tckn;
}





}
