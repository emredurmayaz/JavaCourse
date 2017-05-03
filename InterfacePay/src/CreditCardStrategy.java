
public class CreditCardStrategy implements PaymentStrategy {
     
	public String name;
	public String cardNumber;
	public String cvv;
	public String dateOfExpiry;
	
	
	public CreditCardStrategy(String name, String cardNumber, String cvv,
			String dateOfExpiry) {
		
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
	}


	@Override
	public void pay() {
		
      System.out.println("Tüm ürünler kredi kartý ilie ödenmiþtir");   
	}

}
