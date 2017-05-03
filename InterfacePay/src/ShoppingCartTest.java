
public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cart=new ShoppingCart();
		Item item=new Item("123", 15);
		cart.addItem(item);
		Item item1=new Item("4560",25);
		cart.addItem(item1);
		
		Item item2=new Item("360",45);
		cart.addItem(item2);
        
		
		CreditCardStrategy cst=new CreditCardStrategy("", "", "", "");
		cart.payViaPaymentStrategy(cst);
		
	}

}
