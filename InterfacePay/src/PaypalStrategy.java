
public class PaypalStrategy implements PaymentStrategy {

	public String emailId;
	public String password;
	
	
	
	public PaypalStrategy(String emailId, String password) {
		super();
		this.emailId = emailId;
		this.password = password;
		
	}



	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("Tüm ürünler paypal ile ödenmiþtir");
	}

}
