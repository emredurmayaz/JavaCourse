
public class Ordek implements Kus {
     int numara;
	 public Ordek(int numara){
   	  this.numara=numara;
   	  
     }
	
	@Override
	public void uc() {
		// TODO Auto-generated method stub
  System.out.println(numara+"�rdek U�abilir");
	}

	@Override
	public void yuz() {
		// TODO Auto-generated method stub
		  System.out.println(numara+"�rdek Y�zebilir");
	}

}
