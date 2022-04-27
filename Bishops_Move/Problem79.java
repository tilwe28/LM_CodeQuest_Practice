import java.util.*;
public class Problem79
{

    public Problem79()
    {
        try (Scanner input = new Scanner(System.in))
        {
            int testCases = Integer.parseInt(input.nextLine());
            for (int testcase = 0; testcase < testCases; testcase++)
            {
                String[] sizeStr = input.nextLine().split(",");
                String[] startStr = input.nextLine().split(",");
                String[] endStr = input.nextLine().split(",");
                Point size = new Point(sizeStr[0], sizeStr[1]), start = new Point(startStr[0], startStr[1]), end = new Point(endStr[0], endStr[1]);
                int x=1, y=1;
                if (start.getR() > end.getR()) x=-1;
                if (start.getC() > end.getC()) y=-1;
                if (Math.abs(start.getR()-end.getR()) == Math.abs(start.getC()-end.getC()))
                    System.out.println("Yes");
                else {
                    while (start.getR() != end.getR() && start.getC() != end.getC())
                    {
                        start.addR(x);
                        start.addC(y);
                    }
                    if (start.getR() == end.getR() && start.getC() == end.getC() && end.getR() <= size.getR() && end.getC() <= size.getC())
                        System.out.println("Yes");
                    else System.out.println("No");
                }
            }
        }
    }
    public static void main(String[] args)
    {
        new Problem79();
    }

     class Point
    {
        int r, c;
        public Point(String r, String c)
        {
            this.r = Integer.parseInt(r);
            this.c = Integer.parseInt(c);
        }

        public int getR() { return r; }
        public int getC() { return c; }

        public void addR(int r) { this.r += r; }
        public void addC(int c) { this.c += c; }
    }
}
