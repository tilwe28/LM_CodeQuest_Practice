import java.util.*;
public class Problem78
{
	public static void main(String[] args)
	{
		try (Scanner input = new Scanner(System.in))
		{
			int testCases = Integer.parseInt(input.nextLine());
			for (int testcase = 0; testcase < testCases; testcase++)
			{
				String values = input.nextLine();
				int num1 = Integer.parseInt(values.split(",")[0]), num2 = Integer.parseInt(values.split(",")[1]);
				do {
					Integer[] nums = { num1, num2 };
					int M = Collections.max(Arrays.asList(nums)), S = Collections.min(Arrays.asList(nums));
					System.out.println(M + "-" + S + "=" + (M-S));
					num1 = S;
					num2 = M-S;
				} while (Math.abs(num1-num2) != 0);
				Integer[] nums = { num1, num2 };
				int M = Collections.max(Arrays.asList(nums)), S = Collections.min(Arrays.asList(nums));
				System.out.println(M + "-" + S + "=" + (M-S));
				if (num1 == 1)
					System.out.println("COPRIME");
				else System.out.println("NOT COPRIME");
			}
		}
	}
}
