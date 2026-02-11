import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][N];
        int num = 1;

        int col = N - 1;
        boolean up = true;

        while (col >= 0) {
            if (up) {
                for (int row=N-1; row>=0; row--) {
                    arr[row][col] = num++;
                }
            } else {
                for (int row=0; row<N; row++) {
                    arr[row][col] = num++;
                }
            }

            up = !up;
            col--;

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