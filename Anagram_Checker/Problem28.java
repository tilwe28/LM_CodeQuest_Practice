import java.util.*;
public class Problem28
{
	public static void main(String[] args)
	{
		try (Scanner input = new Scanner(System.in))
		{
			int testCases = Integer.parseInt(input.nextLine());
			for (int testcase = 0; testcase < testCases; testcase++)
			{
				String[] values = input.nextLine().split("\\|");
				Map<Character, Integer> w1 = new HashMap<>(), w2 = new HashMap<>();
				for (char c : values[0].toCharArray())
					if (w1.containsKey(c))
						w1.put(c, w1.get(c)+1);
					else w1.put(c, 1);
				for (char c : values[1].toCharArray())
					if (w2.containsKey(c))
						w2.put(c, w2.get(c)+1);
					else
						w2.put(c, 1);
				boolean anagram = w1.size() == w2.size();
				for (Map.Entry<Character, Integer> entry : w1.entrySet())
					if (entry.getValue() != w2.get(entry.getKey()))
						anagram = false;
				System.out.print(values[0] + "|" + values[1] + " = ");
				if (anagram && !values[0].equals(values[1]))
					System.out.println("ANAGRAM");
				else System.out.println("NOT AN ANAGRAM");
			}
		}
	}
}
