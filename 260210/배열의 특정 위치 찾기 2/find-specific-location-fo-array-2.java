import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[10];
        int sum1 = 0;
        int sum2 = 0;

        for(int i=0; i<10; i++) {
            int value = Integer.parseInt(st.nextToken());

            arr[i] = value;

            if (i%2==0) {
                sum1 += arr[i];
            }

            else
                sum2 += arr[i];
        }

        if (sum1 >= sum2)
            System.out.println(sum1 - sum2);
        else   
            System.out.println(sum2 - sum1);
        
    }
}