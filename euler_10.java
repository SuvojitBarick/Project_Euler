public class prog10
{
	public static void main(String[] args)
	{
		int s=0,i;
		for(i=0;i<2000000;i++)
		{
		if (isPrime(i));
		s=s+1;
		}
		System.out.println(s);
		
	}
		public static boolean isPrime(long n)
		{
		 int i,c=0;
		 for(i=2;i<=n;i++)
		 {
			if(n%i==0) 
			{
			c=c+1;	
			}
		 }
		 if(c==2)
		 {
			return true; 
		 }
		 else
		 {
			 return false;
		 }
		}
		
	}


