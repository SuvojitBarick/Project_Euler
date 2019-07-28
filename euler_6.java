public class euler_6
{
	public static long sumofSquares()
	{
		int i;
		long t=0;
		for(i=1;i<=100;i++)
		{
			t=t+(i*i);
		}
		return t;
	}
    public static long squareofSums()
    {
    	int i;
    	long t=0;
    	for(i=1;i<=100;i++)
		{
			t=t+i;
		}
    	return (t*t);
    }
    public static void main (String[] args)
    {
    	System.out.println(squareofSums()-sumofSquares());
    }
}
