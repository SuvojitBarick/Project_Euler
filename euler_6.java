public class euler_6
{
	public static long getDiff()
	{
		int i;
		long t=0,t1=0;
		for(i=1;i<=100;i++)
		{
			t=t+(i*i);
			t1=t1+i;
		}
		return(( t1*t1)-t);
	}
  
    public static void main (String[] args)
    {
    	System.out.println(getDiff());
    }
}
