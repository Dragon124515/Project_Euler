package problem_14;

public class Source {

	public static void main(String[] args) 
	{
		int l = 0;
		long li = 0;
		for(long t = 1;t<1000000;t++)
		{
			long i = t;
			int c = 0;
			while(i!=1)
			{

				c++;
				if(i%2==0)
					i/=2;
				else
					i=3*i+1;
			}
			if(c>l)
			{
				l=c;
				li = t;
			}
		}
		System.out.println(li);

	}

}
