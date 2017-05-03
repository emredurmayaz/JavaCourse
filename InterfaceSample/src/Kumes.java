import java.util.ArrayList;


public class Kumes {

	ArrayList<Kus> kumes=new ArrayList<>();
   
	
	public void kumeseElemanEkle(Kus k)
	{
		
		kumes.add(k);
	}
	
	public void listele()
	{
		
		for (Kus kus : kumes) {
			kus.uc();
			kus.yuz();
		}
	}
}
