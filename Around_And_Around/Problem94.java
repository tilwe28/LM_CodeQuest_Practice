import java.util.*;
public class Problem94
{
	public static void main(String[] args)
	{
		try (Scanner input = new Scanner(System.in))
		{
			int testCases = Integer.parseInt(input.nextLine());
			double r = 40075/(2 * Math.PI);
			for (int testcase = 0; testcase < testCases; testcase++)
			{
				int altitude = Integer.parseInt(input.nextLine());
				double val = (double)Math.round((altitude+r)*2*Math.PI * 10) / 10;
				System.out.println(val);
			}
		}
	}
}
