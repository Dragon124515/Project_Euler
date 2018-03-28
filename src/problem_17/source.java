package problem_17;

public class source {

	public static void main(String[] args) 
	{
		int c = 0;
		for(int i = 1;i<=1000;i++)
		{
			c += numLetter(i);
		}
		System.out.println(c);
		System.out.println(numLetter(3));

	}

	public static int numLetter(int i)
	{
		int c = 0;
		if(i%10 == 1)
			c+=3;
		if(i%10 == 2)
			c+=3;
		if(i%10 == 3)
			c+=5;
		if(i%10 == 4)
			c+=4;
		if(i%10 == 5)
			c+=4;
		if(i%10 == 6)
			c+=3;
		if(i%10 == 7)
			c+=5;
		if(i%10 == 8)
			c+=5;
		if(i%10 == 9)
			c+=4;
		if(i%100 == 10)
		{
			c+=3;
		}
		if(i%100 == 11)
		{
			c+=3;
		}
		if(i%100 == 12)
		{
			c+=3;
		}
		if(i%100 == 13)
		{
			c+=3;
		}
		if(i%100 == 14)
		{
			c+=4;
		}
		if(i%100 == 15)
		{
			c+=3;
		}
		if(i%100 == 16)
		{
			c+=4;
		}
		if(i%100 == 17)
		{
			c+=4;
		}
		if(i%100 == 18)
		{
			c+=3;
		}
		if(i%100 == 19)
		{
			c+=4;
		}
		if(i%100/10 == 2)
		{
			c+=6;
		}
		if(i%100/10 == 3)
		{
			c+=5;
		}
		if(i%100/10 == 4)
		{
			c+=5;
		}
		if(i%100/10 == 5)
		{
			c+=5;
		}
		if(i%100/10 == 6)
		{
			c+=5;
		}
		if(i%100/10 == 7)
		{
			c+=7;
		}
		if(i%100/10 == 8)
		{
			c+=7;
		}
		if(i%100/10 == 9)
		{
			c+=6;
		}
		if(i == 1000)
			c+=11;
		if(i/100 == 1)
		{
			if(i%100 != 0)
				c+=3;
			c+=10;
		}
		if(i/100 == 2)
		{
			if(i%100 != 0)
				c+=3;
			c+=10;
		}
		if(i/100 == 3)
		{
			if(i%100 != 0)
				c+=3;
			c+=12;
		}
		if(i/100 == 4)
		{
			if(i%100 != 0)
				c+=3;
			c+=11;
		}
		if(i/100 == 5)
		{
			if(i%100 != 0)
				c+=3;
			c+=11;
		}
		if(i/100 == 6)
		{
			if(i%100 != 0)
				c+=3;
			c+=10;
		}
		if(i/100 == 7)
		{
			if(i%100 != 0)
				c+=3;
			c+=12;
		}
		if(i/100 == 8)
		{
			if(i%100 != 0)
				c+=3;
			c+=12;
		}
		if(i/100 == 9)
		{
			if(i%100 != 0)
				c+=3;
			c+=11;
		}
		return c;
	}
}
