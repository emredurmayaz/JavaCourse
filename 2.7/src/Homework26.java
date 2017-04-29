import java.util.Scanner;


public class Homework26 {

	public static void main(String[] args) {
		int a,result=0,temp;
		
		System.out.println("Enter a number from 0 to 1000");
		Scanner girdi = new Scanner(System.in);
		a=girdi.nextInt();
		
		temp=a;
		
		
		while (temp > 0)//Gecici 0 olana kadar döngü devam etsin
        {
            result = (temp % 10) + result;
            temp /= 10;

        }

        System.out.println(result);

	}

}
