
public class Ford extends Araba implements Calistirilabilir {

	public void bilgiYaz()
	{
		
		System.out.println(marka+""+model+"araba �al�st�");
		
	}
	
	
	
	@Override
	public void calistir() {
		// TODO Auto-generated method stub
		System.out.println("Ford �al�st�");
	}



	

}
