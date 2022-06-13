
public class Armstrong {
	public static void main(String[] args) {
		int a, rem, sum=0;
		int n=153;
		while(n>0)
		{
			rem=n%10;
			int cube = rem*rem*rem;
			 sum = cube+sum;
			  n = n/10;
		}
		System.out.println(sum);
	}

}
