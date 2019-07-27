public class prog9 
{
	public static void main(String[] args)
	{
		getProduct();
	}
	public static void getProduct() {
		int a,b;
		int c;
		for(a=1;a<=1000;a++)
		{
			for(b=a+1;b<1000;b++)
			{
				c=1000 - a - b;				 
				if((a*a)+(b*b) == (c*c))
				{
					System.out.println(a*b*c);
					break;
				}
			}
		}
	}

}
