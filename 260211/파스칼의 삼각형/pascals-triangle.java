import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][N];

        // 기본값 세팅
        for (int i = 0; i < N; i++) {
            arr[i][0] = 1;
            arr[i][i] = 1;
        }


        // 2. 규칙
        for (int i=2; i<N; i++) {
            for (int j=1; j<i; j++) {
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }


        // 출력
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                if (arr[i][j] != 0)
                    System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}