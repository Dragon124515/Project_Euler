package utility;

//skipped problems: 12


public class utility 

{
	static int[] p;
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
	
	
	
	
	public static boolean palindrone(int n)
	{
		String t = n+"";
		for(int i = 0;i<t.length()/2;i++)
		{
			if(t.charAt(i)!=t.charAt(t.length()-1-i))
				return false;
		}
		return true;
	}

}
