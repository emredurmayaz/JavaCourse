
public class Tavuk implements Kus {
      int numara;
      public Tavuk(int numara){
    	  this.numara=numara;
    	  
      }
	@Override
	public void uc() {
		// TODO Auto-generated method stub
		System.out.println(numara+"Tavuklar ucamaz");
		
	}

	@Override
	public void yuz() {
		// TODO Auto-generated method stub
		System.out.println(numara+"Tavuklar yuzemez");
	}

}
