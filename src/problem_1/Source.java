package problem_1;

public class Source {

	public static void main(String[] args) 
	{
		int c = 0;
		for(int i = 0;i<1000;i++)
		{
			if(i%3==0||i%5==0)
			{
				c+=i;
			}
		}
		System.out.println(c);
	}

}
