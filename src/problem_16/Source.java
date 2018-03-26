package problem_16;

import java.math.BigInteger;

public class Source {

	public static void main(String[] args) 
	{
		String a = "1111101000"; //1000 in binary for binary exponentiation
		boolean[] pow = new boolean[a.length()];
		for(int i = 0;i<a.length();i++)
		{
			if(a.charAt(a.length()-1-i)=='1')
			{
				pow[i] = true;
			}
		}
		
		BigInteger pow2 = new BigInteger("2");
		BigInteger total = new BigInteger("1");
		for(int i = 0;i<a.length();i++)
		{
			if(pow[i])
				total = total.multiply(pow2);
			pow2 = pow2.multiply(pow2);
		}
		String s = total.toString();
		int c = 0;
		for(int i = 0;i<s.length();i++)
		{
			c+=s.charAt(i)-48;
		}
		System.out.println(c);
	}

}
