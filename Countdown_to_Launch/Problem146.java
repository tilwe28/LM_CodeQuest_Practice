import java.util.*;
import java.math.*;
public class Problem146
{
    public static void main(String[] args)
    {
        try (Scanner in = new Scanner(System.in))
        {
            int testCases = Integer.parseInt(in.nextLine());
            for (int tc=0; tc<testCases; tc++)
            {
                int windows = Integer.parseInt(in.nextLine()), abort = 0;
                boolean yes = false;
                for (int window=0; window<windows; window++)
                {
                    String[] values = in.nextLine().split(" ");
                    String date = values[0], time = values[1];
                    int cloud = Integer.parseInt(values[2]), direction = Integer.parseInt(values[4]);
                    double windspeed = Double.parseDouble(values[3]);
                    double wNS = Math.abs(windspeed*Math.cos(direction*Math.PI/180)), wEW = Math.abs(windspeed*Math.sin(direction*Math.PI/180));
                    //System.out.println(wNS + "\t" + wEW);
                    if (cloud <= 1000 && wNS <= 20 && wEW <= 40 && !yes)
                    {
                        System.out.println(date + " " + time);
                        yes = true;
                    }
                    else abort++;
                }
                if (abort == windows) System.out.println("ABORT LAUNCH");
            }
        }
    }
}
