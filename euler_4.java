public class euler_4 
{
public static void main(String[] args)
{
	System.out.println(largestPalindrome(999,999));
	
}

public static long largestPalindrome(long a,long b)
{
	long m=0;
	long  i,j,p;
	for(i=a;i>99;i--)
	{
		for(j=b;j>=i;j--)
		{
			p=i*j;
			if(isPalindrome(p)==true)
			m=Math.max(m, p);	
			}
		}
		return m;

}
public static boolean isPalindrome(long n)
{
	long rev=0,r,t=n;
	while(n>0)
	{
		r=n%10;
		rev=rev*10+r;
		n=n/10;
		
	}
	 if(rev==t)
	 {
		 return true;
	 }
		 else
		 {
			return false; 
		 }

}
}