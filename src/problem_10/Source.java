package problem_10;

public class Source {

	public static void main(String[] args) {
		erat(2000000);

	}
	
	public static void erat(int n)
	{
		boolean[] np = new boolean[n];
		np[0] = true;
		np[1] = true;
		long c = 0;
		for(int i = 2;i<n;i++)
		{
			if(!np[i])
			{
				c+=i;
				for(int j =2*i;j<n;j+=i)
				{
					np[j]=true;
				}
			}
		}
		System.out.println(c);
	}

}
