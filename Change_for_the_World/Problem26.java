import java.util.*;
public class Problem26
{
    public static void main(String[] args)
    {
        try (Scanner input = new Scanner(System.in))
        {
            int testCases = Integer.parseInt(input.nextLine());
            for (int testcase = 0; testcase < testCases; testcase++)
            {
                double value = Double.parseDouble(input.nextLine().substring(1));int curr = (int)(100*value);
                int q = curr / 25, d = curr % 25 / 10, n = curr % 25 % 10 / 5, p = curr % 25 % 10 % 5;
                System.out.println("$"+String.format("%.2f", value));
                System.out.println("Quarters="+q);
                System.out.println("Dimes="+d);
                System.out.println("Nickels="+n);
                System.out.println("Pennies="+p);
            }
        }
    }
}
