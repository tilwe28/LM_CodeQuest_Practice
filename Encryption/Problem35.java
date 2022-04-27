import java.util.*;
public class Problem35
{
    public static void main(String[] args)
    {
        try (Scanner in = new Scanner(System.in))
        {
            int testCases = Integer.parseInt(in.nextLine());
            final String abc = "abcdefghijklmnopqrstuvwxyz";
            for (int tc = 0; tc < testCases; tc++)
            {
                String encrypt = in.nextLine(), cipher = in.nextLine();
                int numMessages = Integer.parseInt(in.nextLine());
                String[] messages = new String[numMessages];
                for (int i=0; i<numMessages; i++)
                    messages[i] = in.nextLine();
                if (encrypt.equals("ENCRYPT"))
                {
                    for (String m : messages)
                    {
                        for (int i=0; i<m.length(); i++)
                        {
                            if (m.charAt(i) == ' ') continue;
                            boolean uppercase = false;
                            if (Character.isUpperCase(m.charAt(i)))
                                uppercase = true;
                            m = m.substring(0, i) + m.substring(i).replaceFirst(String.valueOf(m.charAt(i)), String.valueOf(cipher.charAt(abc.indexOf(Character.toLowerCase(m.charAt(i))))));
                            if (uppercase)
                                m = m.replaceFirst(String.valueOf(m.charAt(i)), String.valueOf(Character.toUpperCase(m.charAt(i))));
                        }
                        System.out.println(m);
                    }
                } else {
                    for (String m : messages)
                    {
                        for (int i=0; i<m.length(); i++)
                        {
                            if (m.charAt(i) == ' ') continue;
                            boolean uppercase = false;
                            if (Character.isUpperCase(m.charAt(i)))
                                uppercase = true;
                            m = m.substring(0, i) + m.substring(i).replaceFirst(String.valueOf(m.charAt(i)), String.valueOf(abc.charAt(cipher.indexOf(Character.toLowerCase(m.charAt(i))))));
                            if (uppercase)
                                m = m.replaceFirst(String.valueOf(m.charAt(i)), String.valueOf(Character.toUpperCase(m.charAt(i))));
                        }
                        System.out.println(m);
                    }
                }
            }
        }
    }
}
