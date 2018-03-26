package problem_3;

public class Source {

	public static int[] p;
	public static void main(String[] args) {
		long c = 600851475143l;
		erat(1000000);
		int i = 0;
		while (c!=1)
		{
			if(c%p[i]==0)
			{
				c=c/p[i];
			}
			else
			{
				i++;
			}
		}
		System.out.println(p[i]);

	}

	public static void erat(int n)
	{
		boolean[] np = new boolean[n];
		np[0] = true;
		np[1] = true;
		int c = 0;
		for(int i = 2;i<n;i++)
		{
			if(!np[i])
			{
				c++;
				for(int j =2*i;j<n;j+=i)
				{
					np[j]=true;
				}
			}
		}
		p = new int[c];
		c=0;
		
		for(int i = 0;i<n;i++)
		{
			if(!np[i])
			{
				p[c]=i;
				c++;
			}
		}
	}
}
