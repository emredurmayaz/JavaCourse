
public class Araba {
private	Marka marka;
private	String model;
private	String kasaTipi;
private	int yil;
private	String seri;
private	String renk;
private	double fiyat;
private	int motor;


	public Araba(Marka marka, String model, String kasaTipi, int yil,
			String seri, String renk, double fiyat, int motor) {
		
		this.marka = marka;
		this.model = model;
		this.kasaTipi = kasaTipi;
		this.yil = yil;
		this.seri = seri;
		this.renk = renk;
		this.fiyat = fiyat;
		this.motor = motor;
	}


	public Marka getMarka() {
		return marka;
	}


	public void setMarka(Marka marka) {
		this.marka = marka;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getKasaTipi() {
		return kasaTipi;
	}


	public void setKasaTipi(String kasaTipi) {
		this.kasaTipi = kasaTipi;
	}


	public int getYil() {
		return yil;
	}


	public void setYil(int yil) {
		this.yil = yil;
	}


	public String getSeri() {
		return seri;
	}


	public void setSeri(String seri) {
		this.seri = seri;
	}


	public String getRenk() {
		return renk;
	}


	public void setRenk(String renk) {
		this.renk = renk;
	}


	public double getFiyat() {
		return fiyat;
	}


	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}


	public int getMotor() {
		return motor;
	}


	public void setMotor(int motor) {
		this.motor = motor;
	}
	
	
	
	

}
