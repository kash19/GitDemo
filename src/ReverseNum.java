
public class ReverseNum {

	public static void main(String[] args) {
		int n=109, rem,rev = 0;
		while(n>0)
		{
		rem= n%10; //109%10=9
		rev=rev*10+rem;  //90+0=90
		n=n/10;
		}
System.out.println(rev);
	}

}
