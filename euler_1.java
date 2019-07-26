public class prog1 
{
	public static void main(String[] args)
	{
		int i,s1=0,s2=0,t;
		for(i=1;i<=1000;i++)
		{
			if(i%3==0)
			{
				s1=s1+i;
			}
		}
		for(i=1;i<=1000;i++)
		{
			if(i%5==0)
			{
				s2=s2+i;
			}
		}
		t=s1+s2;
		System.out.println(t);
	}
}
