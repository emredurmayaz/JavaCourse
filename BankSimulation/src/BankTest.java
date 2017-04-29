import java.util.Scanner;

public class BankTest {

	private static Scanner input;

	public static void main(String[] args) {
	input = new Scanner(System.in);
	Bank bank=new Bank();
	int option=0;
		do {
		System.out.println("[1] Adding a new customer");
		System.out.println("[2] Deleting an existing customer (by customer ID)");
		System.out.println("[3] Listing all customers");
		System.out.println("[4] Listing customers by customer ID");
		System.out.println("[5] Updating a customers information");
                System.out.println("[6] Adding money to bank");
                System.out.println("[7] Adding money to bank");
		System.out.print("    What is Your Choice : ");
	    int choice=input.nextInt();
	    switch (choice) {
		case 1:
			bank.newCustomer();
			break;
		case 2:
			System.out.println("Enter delete ID");
			String id5=input.next();
			bank.deleteCustomer(id5);
			
		    break;
		case 3:
			bank.listCustomer();
			break;
        case 4:
        	
    	System.out.println("Enter Customer ID");
    	String id1=input.next();
		    Customer search1=bank.searchCustomer(id1);
		    if (search1!=null) {
			bank.listCustomer(search1);
		}
			
			break;
        case 5:
        
        	System.out.println("Enter Customer ID");
        	String id=input.next();
 		    Customer search=bank.searchCustomer(id);
 		    if (search!=null) {
				if (bank.UpdateCustomer(search)) {
					System.out.println("Uptadeted");
				}
			}
 		
	
	        break;
                
        case 6:
            String tempID;
		System.out.println("ENTER ID for ADDİNG CREDİT");
		tempID=input.next();
             bank.addCredit(tempID);
 		
       
            break;
            case 7:
            String temptID;
		System.out.println("ENTER ID for Draw CREDİT");
		temptID=input.next();
             bank.drawCredit(temptID);
 		
       
            break;
		default:
                    System.out.println("You enter 1-7");
			break;
		}
		
			
		} while (option!=-1);
		
		
		

	}

}
