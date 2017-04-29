import java.util.Scanner;


public class Homework25 {

	public static void main(String[] args) {
		int x,y,z,result;
		Scanner girdi = new Scanner(System.in);
		System.out.print("Enter first integer");
		x=girdi.nextInt();
		System.out.print("Enter second integer");
		y=girdi.nextInt();
		System.out.print("Enter third integer");
		z=girdi.nextInt();
		result=x*y*z;
		System.out.printf("Result is %d",result);

	}

}
