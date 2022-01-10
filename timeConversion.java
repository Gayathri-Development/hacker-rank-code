import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        StringBuilder output = new StringBuilder("");
        // Get hours
        int h1 = (int)s.charAt(1) - '0';
        int h2 = (int)s.charAt(0) - '0';
        int hh = (h2 * 10 + h1 % 10);

        // If time is in "AM"
        if (s.charAt(8) == 'A')
        {
            if (hh == 12)
            {
                // System.out.print("00");
                output = new StringBuilder("00");
                for (int i = 2; i <= 7; i++)
                    // System.out.print(s.charAt(i));
                    output.append(s.charAt(i));
            }
            else
            {
                for (int i = 0; i <= 7; i++)
                    // System.out.print(s.charAt(i));
                    output.append(s.charAt(i));
            }
        }

        // If time is in "PM"
        else
        {
            if (hh == 12)
            {
                // System.out.print("12");
                 output = new StringBuilder("12");
                for (int i = 2; i <= 7; i++)
                    // System.out.print(s.charAt(i));
                    output.append(s.charAt(i));
            }
            else
            {
                hh = hh + 12;
                // System.out.print(hh);
                 output = new StringBuilder(hh);
                 output.append(hh);
                //  System.out.println("output = " + hh);
                for (int i = 2; i <= 7; i++)
                    // System.out.print(s.charAt(i));
                    output.append(s.charAt(i));
            }
        }
        return (output.toString());
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
