
public class Ordek implements Kus {
     int numara;
	 public Ordek(int numara){
   	  this.numara=numara;
   	  
     }
	
	@Override
	public void uc() {
		// TODO Auto-generated method stub
  System.out.println(numara+"Ördek Uçabilir");
	}

	@Override
	public void yuz() {
		// TODO Auto-generated method stub
		  System.out.println(numara+"Ördek Yüzebilir");
	}

}
