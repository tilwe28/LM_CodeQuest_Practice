import java.util.*;
public class Problem133
{
	public static void main(String[] args)
	{
		try (Scanner input = new Scanner(System.in))
		{
			int testCases = Integer.parseInt(input.nextLine());
			for (int testcase = 0; testcase < testCases; testcase++)
			{
				String values = input.nextLine();
				ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(values.split(" ")));
				System.out.println(Collections.max(nums));
			}
		}
	}
}
