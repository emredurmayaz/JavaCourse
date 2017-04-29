import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
	Scanner input=new Scanner(System.in);
	public ArrayList<Customer> bank =new ArrayList<Customer>();
	
	public void newCustomer()
	{
		System.out.println("Enter customer id :");
		String customerID= input.next();
		System.out.println("Enter customer name :");
		String customerName=input.next();
		System.out.println("Enter customer surname :");
		String customerSurname=input.next();
		System.out.println("Enter personel sex :");
		String customerSex=input.next();
		System.out.println("Enter Credit :");
		double customerCredit=input.nextDouble();
		Customer customer=new Customer(customerID, customerName, customerSurname, customerSex, customerCredit);
		bank.add(customer);
		}
		//buraya silme i�lemi gelicek
		
		public void listCustomer()
		{
			System.out.println("ID\t NAME\t SURNAME   SEX\t CREDIT");
			
			for (Customer customer : bank) {
				System.out.printf("%s\t %s\t %s\t   %s\t %.2f\t\n\n",customer.getId(),customer.name,customer.surname,customer.sex,customer.credit);
			}
		}
		public void listCustomer(Customer customer)
		{
			System.out.println("ID\t NAME\t SURNAME   SEX\t CREDIT");
			
			
				System.out.printf("%s\t %s\t %s\t   %s\t %.2f\t\n\n",customer.getId(),customer.name,customer.surname,customer.sex,customer.credit);
			
		}
		
		public boolean UpdateCustomer(Customer cust)
		{
			boolean durum=false;
			try {
			System.out.print("Enter customer name :");
		    cust.name=input.next();
			System.out.print("Enter Customer Surname :");
			cust.surname=input.next();
		    System.out.println("Enter customer sex :");
		    cust.sex=input.next();
                    System.out.println("Enter customer sex :");
		    cust.sex=input.next();
                    System.out.println("Enter customer credit :");
                    double customerCredit=input.nextDouble();
			durum=true;
				
			} catch (Exception e) {
				
			}
			return durum;
		}
		public Customer searchCustomer(String id)
		{
			Customer find=null;
			for (Customer customer : bank) {
				if (customer.getId().contains(id)) {
					find=customer;
					break;
				}
			}
			return find;
		}
		public boolean deleteCustomer(String id)
		{
			int indis=0;
			boolean  durum = false;
			for (Customer customer : bank) {
				if(customer.getId().contains(id.toLowerCase()))
			{
					bank.remove(indis);
				    durum=true;
					break;
					}
			indis++;
			}
				return durum;
			}

                public Customer addCredit(String id) {
					Customer find = null;


					find = searchCustomer(id);
					if (find != null) {
						System.out.println("Your account has :" + find.credit + "\n enter money for adding:");
						find.credit = find.credit + input.nextDouble();

						System.out.println("CURRENT INFORMATION");
						System.out.println(find.credit);
					}
					return find;

				}
            public Customer drawCredit(String id)
		{
			Customer draw =null;
                      double drawCredit;
                
		drawCredit=input.nextDouble();
			
		draw=searchCustomer(id);
                
		if( draw!= null){
			System.out.println("Your account has :"+ draw.credit +" enter money for drawing:");
                        
                        drawCredit=input.nextDouble();
                        if(draw.credit>=drawCredit){
			  draw.credit =draw.credit - drawCredit;
                        }
                        else{
                           System.out.println("You can not get more money from your account"); 
                        }
                }
                      
			System.out.println("CURRENT INFORMATION");
			System.out.println(draw.credit);
		
			return draw;
                        
                }       
}
  
