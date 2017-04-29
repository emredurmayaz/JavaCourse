import java.util.Scanner;
public class Homework27 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter number of minutes :");
		int minutes=input.nextInt();

		        int years = minutes / 525600;
		        int days = (minutes % 525600) / 1440;

		        System.out.println(minutes + " minutes is " + years+ " years and " + days + " days");
		
	}
}
