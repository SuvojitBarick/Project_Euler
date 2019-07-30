public class euler_7 
{
	     public static boolean checkPrime(long n)
          {
	        if (n < 2) return false;
	        else if (n == 2) return true;
	        for (int i = 2; i < Math.sqrt(n) + 1; i++)
	            if (n % i == 0)
	                return false;
	        return true;
	       }
	
	public static long nthPrime(long n)
	{
		long i, c=1,s=0;
		for(i=2;c<=n;i++)
		{
			if(checkPrime(i))
			{
				s=i;
				c=c+1;
			}
		}
		return s;
	}
	public static void main(String[] args)
	{
		System.out.println(nthPrime(10001));
	}
}
