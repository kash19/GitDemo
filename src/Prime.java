import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int n, i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		n= s.nextInt();
		if(n==1) {
			System.out.println("prime number is 2 samllest");
		}
		for(i=2;i<n;i++)
		{
if(n%i==0)
			{
				System.out.println("No prime number");
				break;
			}
		}
		if(n==i) {
			System.out.println("Number is prime");
		}
		
	}
}
