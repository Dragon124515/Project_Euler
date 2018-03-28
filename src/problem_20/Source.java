package problem_20;

import java.math.BigInteger;

public class Source {

	public static void main(String[] args) {
		BigInteger c  = new BigInteger("1");
		for(int i = 2;i<=100;i++)
		{
			c = c.multiply(new BigInteger(i+""));
		}
		String[] nums = c.toString().split("");
		int count = 0;
		for(int i = 0;i<nums.length;i++)
		{
			count+=Integer.parseInt(nums[i]);
		}
		System.out.println(count);

	}

}
