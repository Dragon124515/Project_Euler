package problem_7;

public class Source {
	public static int[] p;

	public static void main(String[] args) {
		erat(1000000);
		System.out.println(p[10000]);

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
