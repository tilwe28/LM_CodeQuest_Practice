import java.util.*;

public class Problem48 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());
            for (int testcase = 0; testcase < testCases; testcase++) {
                String values = input.nextLine();
                String name = values.split(":")[0];
                ArrayList<String> atBats = new ArrayList<>(Arrays.asList(values.split(":")[1].split(",")));
                while (atBats.contains("BB"))
                    atBats.remove("BB");
                int singles = 0, doubles = 0, triples = 0, hr = 0;
                for (String s : atBats) {
                    if (s.contains("1"))
                        singles++;
                    if (s.contains("2"))
                        doubles++;
                    if (s.contains("3"))
                        triples++;
                    if (s.contains("HR"))
                        hr++;
                }
                double slg = (double) (singles + (2 * doubles) + (3 * triples) + (4 * hr)) / (atBats.size());
                slg = (double) Math.round(slg * (int) (Math.pow(10, 3))) / (int) (Math.pow(10, 3));
                System.out.println(name + "=" + String.format("%.3f", slg));
            }
        }
    }
}