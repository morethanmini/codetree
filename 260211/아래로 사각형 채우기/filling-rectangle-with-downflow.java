import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][N];
        int num = 1;

        for (int j=0; j<N; j++) {
            for (int i=0; i<N; i++) {
                arr[i][j] = num;
                num++;
            }
        }

        // 출력
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // System.out.print(Arrays.deepToString(arr));
    }
}