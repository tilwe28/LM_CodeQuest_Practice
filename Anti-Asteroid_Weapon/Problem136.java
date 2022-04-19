import java.util.*;
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
				Map<Double, String> map = new HashMap<Double, String>();
				for (int i=0; i<asteroids; i++)
				{
					String values = input.nextLine();
					double d = Math.hypot(Integer.parseInt(values.split(" ")[0]), Integer.parseInt(values.split(" ")[1]));
					distances[i] = d;
					map.put(d, values);
				}

				for (int i=1; i<distances.length; i++)
				{
					double d = distances[i];
					int j = i-1;
					while (j>=0 && distances[j]>d)
					{
						distances[j+1] = distances[j];
						j--;
					}
					distances[j+1] = d;
				}

				for (double d : distances)
					System.out.println(map.get(d));
			}
		}
	}
}
