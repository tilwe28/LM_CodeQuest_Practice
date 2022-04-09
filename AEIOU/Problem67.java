import java.util.Scanner;
public class Problem67
{
	public static void main(String[] args)
	{
		try (Scanner input = new Scanner(System.in))
		{
			int testCases = Integer.parseInt(input.nextLine());
			for (int testcase = 0; testcase < testCases; testcase++)
			{
				String line = input.nextLine();
				int count = 0;
				for (char c : line.toCharArray())
					switch (c) {
						case 'a':
						case 'A':
						case 'e':
						case 'E':
						case 'i':
						case 'I':
						case 'o':
						case 'O':
						case 'u':
						case 'U':
							count++;
					}
				System.out.println(count);
			}
		}
	}
}
