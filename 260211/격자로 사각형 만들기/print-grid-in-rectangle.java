import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][N];
        
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                arr[i][j] = 1;
            }
        }

        for (int i=1; i<N; i++) {
            for (int j=1; j<N; j++) {
                arr[i][j] = arr[i-1][j] + arr[i][j-1] + arr[i-1][j-1];
            }
        }




        // 출력
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        
    }
}