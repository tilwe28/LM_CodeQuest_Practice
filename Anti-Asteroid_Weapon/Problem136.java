import java.util.Scanner;
public class Problem136
{
	public static void main(String[] args)
	{
		try (Scanner input = new Scanner(System.in))
		{
			int testCases = Integer.parseInt(input.nextLine());
			for (int testcase = 0; testcase < testCases; testcase++)
			{
				int asteroids = Integer.parseInt(input.nextLine());
				double[] distances = new double[asteroids];
				for (int i=0; i<asteroids; i++)
				{
					String[] values = input.nextLine().split(" ");
					double d = Math.hypot(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
					distances[i] = d;
				}

			}
		}
	}
}
