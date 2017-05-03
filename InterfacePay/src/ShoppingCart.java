import java.util.ArrayList;


public class ShoppingCart {
private ArrayList<Item> items= new ArrayList<>();


public void addItem(Item item)
{
	
	items.add(item);
}
public void removeItem(Item item)
{
	if(items.contains(item))
		items.remove(item);
	
}
public int calculateTotal()
{
	int total=0;
	
	for (Item item : items) {
		
	    total+=item.getPrice();
	}
	
	return total;
	
}

public void payViaPaymentStrategy(PaymentStrategy st)
{
	System.out.println("toplam fiyat:"+calculateTotal());
	st.pay();
}

}
