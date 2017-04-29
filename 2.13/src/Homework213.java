import java.util.Scanner;


public class Homework213 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);	// Create a new Scanner object.
         double MONTHLY_INTEREST_RATE = 0.00417;	// Initialize constant value


         System.out.print("Enter the monthly saving amount: ");
         double savingAmount = input.nextDouble();


         double total = 100 * (1 + MONTHLY_INTEREST_RATE);

         int i=0;
         while (i<5) {
                 total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
                 i++;
         }




         System.out.println("After the sixth month, the account value is " + total);

         System.out.println( MONTHLY_INTEREST_RATE);
	}

}
