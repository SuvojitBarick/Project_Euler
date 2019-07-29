public class euler_3 {
	public static void largestPrimeFactor(long n) {
		int i;
		for (i = 2; i <=n; i++) {
			if (n % i == 0) {
				n = n / i;
				i--;
			}
		}
		System.out.println(i);
	}

	public static void main(String[] args)
	{
		long l = 600851475143L;
		largestPrimeFactor(l);

	}
}
