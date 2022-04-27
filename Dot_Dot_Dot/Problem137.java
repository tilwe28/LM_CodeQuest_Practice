import java.util.*;
public class Problem137
{
    public static void main(String[] args)
    {
        try (Scanner input = new Scanner(System.in))
        {
            int testCases = Integer.parseInt(input.nextLine());
            for (int testcase = 0; testcase < testCases; testcase++)
            {
                char[] letters = input.nextLine().toCharArray();
                int total = 0;
                for (char c : letters)
                    total += (int)c - 96;
                System.out.println(total);
            }
        }
    }
}
