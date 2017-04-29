import java.util.Scanner;


public class HomeWork26 {

	public static void main(String[] args) {
		double a,b,c,d,e,f,x,y;
		Scanner girdi = new Scanner(System.in);
		System.out.println(" ax + by = e\n cx + dy = f\n");
		System.out.println("Enter first number a:");
		a=girdi.nextDouble();
		System.out.println("Enter second number b:");
		b=girdi.nextDouble();
		System.out.println("Enter third number c:");
		c=girdi.nextDouble();
		System.out.println("Enter fourth number d:");
		d=girdi.nextDouble();
		System.out.println("Enter fifth number e:");
		e=girdi.nextDouble();
		System.out.println("Enter sixth number f:");
		f=girdi.nextDouble();
		
		x=(((e*d)-(b*f))/((a*d)-(b*c)));
		 y=(((a*f)-(e*c))/((a*d)-(b*c)));
		 
		 
		 System.out.printf("%.2f x + %.2f y = %.2f ",a,b,((a*x)+(b*y)));
         System.out.printf("%.2f x + %.2f y = %.2f ",c,d,((c*x)+(d*y)));
	}

}
