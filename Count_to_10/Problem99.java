import java.util.*;
public class Problem99
{
	public static void main(String[] args)
	{
		try (Scanner input = new Scanner(System.in))
		{
			int testCases = Integer.parseInt(input.nextLine());
			for (int testcase = 0; testcase < testCases; testcase++)
			{

				int bits = Integer.parseInt(input.nextLine());
				for (int i = 0; i < Math.pow(2, bits); i++)
				{
					System.out.println(String.format("%0"+(bits+1-Integer.toBinaryString(i).length())+"d%s", 0, Integer.toBinaryString(i)).substring(1));
				}
			}
		}
	}
}
