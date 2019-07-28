public class prog3
{
	public static void largestPrimeFactor(long n)
     { 
	int i;
	long c = n;
	for (i = 2; i <= c; i++)
	{ 
		if (c % i == 0) 
	{ 
		c =c/i;
		i--; 
		} 
		}
	System.out.println(i);
}

public static void main (String[] args)
{
	int i,n=0;
	long l=600851475143L;
	largestPrimeFactor(l);
	
}
}
