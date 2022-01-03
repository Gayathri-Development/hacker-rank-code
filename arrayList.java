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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        long minVal = 0;
        long maxVal = 0;
        long temp = 0;
        ArrayList<Long> sumArray = new ArrayList<Long>();
        
        for (int i=0; i<arr.size(); i++){
            for (int j=0; j<arr.size(); j++){
                if (j != i){
                    temp = temp + arr.get(j); 
                    // temp = temp + 256741038;
                }
            }
            // System.out.println(temp);
            sumArray.add(new Long(temp));
            temp = 0;
        }
        minVal = sumArray.get(0); 
        maxVal = sumArray.get(0); 
        for (int k=0; k<sumArray.size(); k++){
            if (maxVal < sumArray.get(k)){
                maxVal = sumArray.get(k);
            }
            if (minVal > sumArray.get(k)){
                minVal = sumArray.get(k);
            }
        }
        System.out.println(minVal + " " + maxVal);
        // System.out.println(sumArray);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
