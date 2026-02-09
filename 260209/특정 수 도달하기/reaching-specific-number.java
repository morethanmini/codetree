import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> lst = new ArrayList<>();

        String[] arr = br.readLine().split(" ");
        int result = 0;
        int cnt = 0;


        for(int i=0; i<arr.length; i++) {
            int value = Integer.parseInt(arr[i]);

            if (value < 250) {
                result += value;
                cnt++;
            } else
                break;
        }

        System.out.println(result + " " + (double)result/cnt);
    }
}