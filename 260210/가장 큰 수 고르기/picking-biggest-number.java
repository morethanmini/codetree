import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        final int INT_MIN = Integer.MIN_VALUE;
        int[] arr = new int[10];
        int maxVal = INT_MIN;

        for(int i=0; i<10; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
                
        }
        System.out.println(maxVal);

        
    }
}