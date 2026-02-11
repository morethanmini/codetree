import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for (int i=0; i<N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int min = Integer.MAX_VALUE;

        for (int i=0; i<N-1; i++) {
            if (arr[i] > arr[i+1]) {
                if (arr[i] - arr[i+1] < min) {
                min = arr[i] - arr[i+1];
                }
            }

            else if (arr[i] < arr[i+1]) {
                if (arr[i+1] - arr[i] < min) {
                    min = arr[i+1] - arr[i];
                }
            }
  
        }

        System.out.print(min);

    }
}