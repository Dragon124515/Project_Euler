package problem_18;

public class Source {

	public static void main(String[] args) {
		String pyr = 
				"75\r\n" + 
				"95 64\r\n" + 
				"17 47 82\r\n" + 
				"18 35 87 10\r\n" + 
				"20 04 82 47 65\r\n" + 
				"19 01 23 75 03 34\r\n" + 
				"88 02 77 73 07 63 67\r\n" + 
				"99 65 04 28 06 16 70 92\r\n" + 
				"41 41 26 56 83 40 80 70 33\r\n" + 
				"41 48 72 33 47 32 37 16 94 29\r\n" + 
				"53 71 44 65 25 43 91 52 97 51 14\r\n" + 
				"70 11 33 28 77 73 17 78 39 68 17 57\r\n" + 
				"91 71 52 38 17 14 91 43 58 50 27 29 48\r\n" + 
				"63 66 04 68 89 53 67 30 73 16 69 87 40 31\r\n" + 
				"04 62 98 27 23 09 70 98 73 93 38 53 60 04 23";
		String[] lvls = pyr.split("\r\n");
		String[][] ele = new String[15][];
		for(int i = 0;i<15;i++)
		{
			ele[i] = lvls[i].split(" ");
		}
		int[][] maxl = new int[15][];
		for(int i = 0;i<15;i++)
		{
			maxl[i] = new int[ele[i].length];
			for(int j = 0;j<ele[i].length;j++)
			{
				maxl[i][j] = Integer.parseInt(ele[i][j]);
			}
		}
		for(int i = 1;i<15;i++)
		{
			maxl[i][0] = maxl[i][0]+maxl[i-1][0];
			maxl[i][maxl[i].length-1] = maxl[i][maxl[i].length-1]+maxl[i-1][maxl[i].length-2];
			for(int j = 1;j<maxl[i].length-1;j++)
			{
				maxl[i][j] = maxl[i][j]+Math.max(maxl[i-1][j-1], maxl[i-1][j]);
			}
		}
		for(int i = 0;i<maxl[14].length-1;i++)
		{
			maxl[14][i+1] = Math.max(maxl[14][i], maxl[14][i+1]);
		}
		System.out.println(maxl[14][14]);

	}

}
