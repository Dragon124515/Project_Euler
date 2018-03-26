package problem_2;

public class Source {

	public static void main(String[] args) 
	{
		int f1 = 1;
		int f2 = 1;
		int c = 0;
		while (f1<4000000)
		{
			int t = f1;
			f1 = f1+f2;
			f2 = t;
			if(f1%2==0)
				c+=f1;
		}
		System.out.println(c);

	}

}
