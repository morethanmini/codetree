import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] arr = new int[4][4];
        
        int sum = 0;

        for (int i=0; i<4; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j=0; j<=i; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                sum += arr[i][j];

                // System.out.print(arr[i][j] + " ");
            }
            // System.out.println();
        }

        System.out.println(sum);
        
    }
}