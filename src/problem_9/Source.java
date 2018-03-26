package problem_9;

public class Source {

	public static void main(String[] args) {
		for(int a = 1;a<1000;a++)
		{
			for(int b = a;b<1000;b++)
			{
				int c = 1000-(a+b);
				if(c*c==a*a+b*b)
				{
					System.out.println(a*b*c);
				}
			}
		}

	}

}
