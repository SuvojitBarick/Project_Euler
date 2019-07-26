public class prog9 
{
	public static void main(String[] args)
	{
		double a,b;
		double s=0,c;
		for(a=3;a<=1000;a++)
		{
			for(b=a+1;b<1000;b++)
			{
				 s=Math.pow(a,2)+Math.pow(b,2);
				 c=Math.pow(s,0.5);
				 
				if((a+b+c) == 1000)
				{
					System.out.println(a*b*c);
					break;
				}
			}
		}
	}

}
