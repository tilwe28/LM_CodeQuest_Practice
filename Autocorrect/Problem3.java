import java.util.*;
public class Problem3
{
	public static void main(String[] args)
	{
		try (Scanner input = new Scanner(System.in))
		{
			int testCases = Integer.parseInt(input.nextLine());
			for (int testcase = 0; testcase < testCases; testcase++)
			{
				String values = input.nextLine();
				int d = Integer.parseInt(values.split(" ")[0]),
				    w = Integer.parseInt(values.split(" ")[1]);

				String[] dict = new String[d];
				for (int i = 0; i < d; i++)
					dict[i] = input.nextLine();

				for (int i = 0; i < w; i++)
				{
					String word = input.nextLine();
					Map<Integer, String> sameLength = new HashMap<>();
					for (String s : dict)
						if (s.length() == word.length())
						{
							int count = 0;
							for (int j = 0; j < word.length(); j++)
								if (s.charAt(j) != word.charAt(j))
									count++;
							sameLength.put(count, s);
						}
					System.out.println(sameLength.get(Collections.min(sameLength.keySet())));
				}
			}
		}
	}
}
