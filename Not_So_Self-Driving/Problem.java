import java.util.Scanner;
public class Problem
{
	public static void main(String[] args)
	{
		try (Scanner input = new Scanner(System.in))
		{
			int testCases = Integer.parseInt(input.nextLine());
			for (int i = 0; i<testCases; i++)
			{
				String[] values = input.nextLine().split(":");
				double speed = Double.parseDouble(values[0]);
				double distance = Double.parseDouble(values[1]);
				if (speed >= distance)
					System.out.println("SWERVE");
				else if (speed*5 >= distance)
					System.out.println("BRAKE");
				else
					System.out.println("SAFE");
			}
		} catch (Exception e) {
			System.err.println("Input number of testCases.");
		}
	}
}
