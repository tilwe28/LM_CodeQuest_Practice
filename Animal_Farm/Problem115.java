import java.util.Scanner;
public class Problem115
{
	public static void main(String[] args)
	{
		try (Scanner input = new Scanner(System.in))
		{
			int testCases = Integer.parseInt(input.nextLine());
			for (int testcase = 0; testcase < testCases; testcase++)
			{
				String[] values = input.nextLine().split(" ");
				int sum = 0;
				for (int i=0; i<values.length; i++)
				{
					if (i==0)
						sum += Integer.parseInt(values[i]) * 2;
					else sum += Integer.parseInt(values[i]) * 4;
				}
				System.out.println(sum);
			}
		}
	}
}
