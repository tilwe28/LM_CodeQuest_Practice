import java.util.*;
public class Problem92
{
    public static void main(String[] args)
    {
        try (Scanner input = new Scanner(System.in))
        {
            int testCases = Integer.parseInt(input.nextLine());
            for (int testcase = 0; testcase < testCases; testcase++)
            {
                String[] values = input.nextLine().split(" ");
                int speed = Integer.parseInt(values[0]);
                boolean bday = Boolean.parseBoolean(values[1]);
                if (bday) speed -= 5;
                if (speed <= 60)
                    System.out.println("no ticket");
                else if (speed <= 80)
                    System.out.println("small ticket");
                else
                    System.out.println("big ticket");
            }
        }
    }
}
