
public class Ford extends Araba implements Calistirilabilir {

	public void bilgiYaz()
	{
		
		System.out.println(marka+""+model+"araba çalýstý");
		
	}
	
	
	
	@Override
	public void calistir() {
		// TODO Auto-generated method stub
		System.out.println("Ford çalýstý");
	}



	

}
