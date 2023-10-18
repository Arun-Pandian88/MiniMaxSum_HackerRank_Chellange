import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Result {

    static void miniMaxSum(List<Integer> arr) {
        long max = arr.get(0);
        long min = arr.get(0);
        long totalSum = 0;

        for (int n : arr) {
            totalSum += n;
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }

        long maxSum = totalSum - min;
        long minSum = totalSum - max;

        System.out.println(minSum + " " + maxSum);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
