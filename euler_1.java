public class euler_1 
{
	public static void main(String[] args)
	{
		int i,s1=0;
		for(i=1;i<1000;i++)
		{
			if((i%3==0)||(i%5==0))
			{
				s1=s1+i;
			}
		}
		System.out.println(s1);
	}
}
