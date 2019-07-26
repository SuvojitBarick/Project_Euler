public class prog2
{
public static void main(String[] args)
{
	int n1=0;
	int n2=1;
	int s=0;
	do
	{
		s=n1+n2;
		n1=n2;
		n2=s;
		if(n2%2==0)
		{
			s=s+n2;
		}
	}
		while(n2<4000000);
		System.out.println(s);
}
}
