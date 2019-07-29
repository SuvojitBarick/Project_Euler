public class euler_5
{

	public static void main(String[] args) {

		long i;
		long s = 1;
		for ( i = 1; i <= 20; i++) 
		{
			s = getLCM(s, i);

		}
		System.out.println(s);
	}

	private static long getLCM(long a, long i) {

		long HCM = getHCM(a, i);
		long LCM = (a * i) / HCM;
		return LCM;

	}
	public static long getHCM(long a,long b)

	  {
	    while (b > 0)
	    {
	        long temp = b;
	        b = a % b; 
	        a = temp;
	    }
	    return a;
	   }
}