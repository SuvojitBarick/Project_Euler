public class prog10 
{
           public static boolean checkPrime(long n)
            {
        	        if (n < 2) return false;
        	        else if (n == 2) return true;
        	        for (int i = 2; i < Math.pow(n, 0.5) + 1; i++)
        	            if (n % i == 0)
        	                return false;
        	        return true;
        	    }
            
    
    public static void main(String[] args)
    {
    	long s=0;
    	int i;
    	for(i=0;i< 2000000;i++)
    	{
    		if(checkPrime(i))
    		{
    			s=s+i;
    		}
    	}
    	System.out.println(s);
    }

}
