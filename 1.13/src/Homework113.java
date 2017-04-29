import java.util.Scanner;


public class Homework113 {

	public static void main(String[] args) {
		double subtotal,gratuityRate,total;
		Scanner girdi =new Scanner(System.in);
		System.out.println("Enter subtotal :");
		subtotal=girdi.nextDouble();
		System.out.println("Enter gratutityrate :");
		gratuityRate=girdi.nextDouble();
		total=subtotal+(gratuityRate/10);
		System.out.printf("total is %.2f",total);

	}

}
