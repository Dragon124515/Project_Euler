package problem_19;

public class Source {

	public static void main(String[] args) 
	{
		int month = 1;
		int day = 6;
		int year = 1;
		int count = 0;
		while (year<101)
		{
			day+=7;
			if(month == 1 && day > 31)
			{
				month++;
				day%=31;
			}
			if((month == 2 && day > 29 && year % 4 == 0)||(month == 2 && day > 28 && year % 4 != 0))
			{
				month++;
				if(year%4==0)
					day%=29;
				else
					day%=28;
			}
			if(month == 3 && day > 31)
			{
				month++;
				day%=31;
			}
			if(month == 4 && day > 30)
			{
				month++;
				day%=30;
			}
			if(month == 5 && day > 31)
			{
				month++;
				day%=31;
			}
			if(month == 6 && day > 30)
			{
				month++;
				day%=30;
			}
			if(month == 7 && day > 31)
			{
				month++;
				day%=31;
			}
			if(month == 8 && day > 31)
			{
				month++;
				day%=31;
			}
			if(month == 9 && day > 30)
			{
				month++;
				day%=30;
			}
			if(month == 10 && day > 31)
			{
				month++;
				day%=31;
			}
			if(month == 11 && day > 30)
			{
				month++;
				day%=30;
			}
			if(month == 12 && day > 31)
			{
				month = 1;
				day%=31;
				year++;
			}
			if(day == 1)
				count++;
			
				
		}
		System.out.println(count);

	}

}
