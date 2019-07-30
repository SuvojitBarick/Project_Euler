public class euler_2
{
public static void main(String[] args)
{
	int n1=0;
	int n2=1;
	int s=0,s1=0;
	do
	{
		s=n1+n2;
		n1=n2;
		n2=s;
		if(s%2==0)
		{
			s1=s1+n2;
		}
	}
		while(n2<4000000);
		System.out.println(s1);
}
}
