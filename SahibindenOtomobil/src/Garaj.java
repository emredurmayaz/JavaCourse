import java.util.ArrayList;
public class Garaj {
	ArrayList<Araba> araclar=new ArrayList<Araba>();
	
public ArrayList<Araba> aracGetir()
{
	return araclar;
	
}
public boolean aracEkle(Araba araba)
{
	try {
		araclar.add(araba);
		return true;
		
	} catch (Exception e) {
		
		return false;
	}
}

public boolean aracSil(String seri)
{
	int indis=0;
	boolean durum=false;
	for(Araba araba : araclar){
		if(araba.getMarka()==araba.getMarka())
		{
			araclar.remove(indis);
		    durum= true;
		    break;
	}
		indis++;
		
	}
	return durum;	
}

public ArrayList<Araba> aracGetir(Araba araba)
{
	ArrayList<Araba> arananlar=new ArrayList<Araba>();
	for (Araba araba2 : arananlar) {
		if(araba2.getMarka()==araba.getMarka())
		{
			arananlar.add(araba2);
			continue;
		}
		
	}
	return arananlar;
}




}
