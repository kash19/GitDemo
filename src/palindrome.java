
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=121,rem,sum=0;
int n=num;
while(n>0)
{
	rem=n%10;
	
 sum = sum*10+rem;
	  n = n/10;
}
//System.out.println(sum);
if(num==sum)
{
	System.out.println("number is palindrom");
}
else
{
	System.out.println("number is not palindrom");
	}
}
}



