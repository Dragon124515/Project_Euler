package problem_21;

public class Source {

	public static void main(String[] args) {//lazy so brute force
		int c = 0;
		for(int i = 2;i<10000;i++)
		{
			if(amicable(i))
				c+=i;
		}
		System.out.println(c);
		System.out.println(amicable(16));

	}
	public static boolean amicable(int n)
	{
		int c = sumDiv(n);
		return sumDiv(c) == n && c != n;
	}
	public static int sumDiv(int n)
	{
		int c = 0;
		for(int i = 1;i<=n/2;i++)
		{
			if(n%i==0)
				c+=i;
		}
		return c;
	}

}
