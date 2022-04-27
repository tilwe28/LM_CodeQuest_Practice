import java.text.DecimalFormat;
import java.util.*;
import java.util.regex.*;
public class Problem122
{
    public static void main(String[] args)
    {
        try (Scanner input = new Scanner(System.in))
        {
            int testCases = Integer.parseInt(input.nextLine());
            for (int testcase = 0; testcase < testCases; testcase++)
            {
                String[] values = input.nextLine().split(" ");
                if (!checkNum(values[0]))
                    System.out.println("Invalid Dividend");
                else if (!checkNum(values[1]))
                    System.out.println("Invalid Divisor");
                else if (Double.parseDouble(values[1]) == 0)
                    System.out.println("Divide By Zero"); 
                else {
                    DecimalFormat d = new DecimalFormat("#.#");
                    System.out.println(String.format(Double.parseDouble(values[0])/Double.parseDouble(values[1])));
                }
            }
        }
    }

    public static boolean checkNum(String s)
    {
        int decimal = 0;
        int nums = 0;
        if (Pattern.compile(".*[a-zA-z].*").matcher(s).matches())
            return false;
        for (char c : s.toCharArray())
        {
            switch (c)
            {
                case '.': decimal++;
                            break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    nums++;
                        break;
            }
        }
        return decimal <= 1 && decimal + nums == s.length();
    }
}
