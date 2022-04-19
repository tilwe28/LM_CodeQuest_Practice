import java.util.*;
public class Problem56
{
	public static void main(String[] args)
	{
		try (Scanner input = new Scanner(System.in))
		{
			int testCases = Integer.parseInt(input.nextLine())-2;
			for (int testcase=0; testcase < testCases; testcase++)
			{
				String values = input.nextLine();
				int expectedResult = Integer.parseInt(values.split(":")[0]);
				int result = Integer.MIN_VALUE;
				int[] nums = new int[values.split(":")[1].split(" ").length/2+1];
				char[] operators = new char[values.split(":")[1].split(" ").length/2];
				int i=0;
				for (String s : values.split(":")[1].split(" "))
				{
					if (s.matches("[0-9]+"))
						nums[i] = Integer.parseInt(s);
					else if (i < operators.length)
						operators[i] = s.charAt(0);
					i++;
				}
				int c = 0;
				while (result != expectedResult && c < 5)
				{
					result = nums[0];
					for (i = 0; i < operators.length; i++)
						switch (operators[i])
						{
							case '+':	result += nums[i+1];
									break;
							case '-':	result -= nums[i+1];
									break;
							case '*':	result *= nums[i+1];
									break;
							case '/':	result /= nums[i+1];
									break;
						}
					c++;
					System.out.println(result);
				}
				System.out.println("TRUE");
			}
		}
	}
}
