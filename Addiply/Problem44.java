import java.util.Scanner;
public class Problem44
{
	public static void main(String[] args)
	{
		try (Scanner input = new Scanner(System.in))
		{
			int testCases = Integer.parseInt(input.nextLine());
			for (int i = 0; i < testCases; i++)
			{
				String[] nums = input.nextLine().split(" ");
				System.out.print(Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]));
				System.out.println(" " + Integer.parseInt(nums[0]) * Integer.parseInt(nums[1]));
			}
		}
	}
}
