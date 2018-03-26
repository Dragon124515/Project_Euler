package problem_4;

public class Source {

	public static void main(String[] args) {
		boolean b = true;
		for(int i= 999999;b;i--)
		{
			if(palin(i))
			{
				for(int j = 999;j>99;j--)
				{
					if(i%j==0)
					{
						if(i/j>99&&i/j<1000)
						{
							System.out.println(i);
							b=false;
							break;
						}
					}
				}
			}
		}

	}

	public static boolean palin(int n)
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
