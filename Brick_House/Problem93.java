import java.util.*;
public class Problem93
{
    public static void main(String[] args)
    {
        try (Scanner input = new Scanner(System.in))
        {
            int testCases = Integer.parseInt(input.nextLine());
            for (int testcase = 0; testcase < testCases; testcase++)
            {
                String[] values = input.nextLine().split(" ");
                int s = Integer.parseInt(values[0]), l = Integer.parseInt(values[1]), t = Integer.parseInt(values[2]);
                if (5*l + s < t)
                    System.out.println(false);
                else if (5*l + s == t)
                    System.out.println(true);
                else {
                    boolean tf = false;
                    int c = 0;
                    for (int i = 0; i < l; i++)
                    {
                        if (c+5 <= t)
                            c += 5;
                        else break;
                    }
                    if (c == t) tf = true;
                    for (int i = 0; i < s; i++)
                    {
                        if (c+1 <= t)
                            c++;
                        else break;
                    }
                    if (c==t || tf) System.out.println(true);
                    else System.out.println(false);
                }
            }
        }
    }
}