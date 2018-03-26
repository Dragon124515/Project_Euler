package problem_6;

public class Source {

	public static void main(String[] args) 
	{
		int c1 = 0;
		int c2 = 0;
		for(int i = 1;i<=100;i++)
		{
			c1+=i*i;
			c2+=i;
		}
		c2=c2*c2;
		System.out.println(c2-c1);

	}

}
