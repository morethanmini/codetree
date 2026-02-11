import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];
        int num = 0;

        for (int j=0; j<M; j++) {
            
            if (j % 2 == 0) {
                for (int i=0; i<N; i++) {
                    arr[i][j] = num;
                    num++;
                }
            }
            else {
                for (int i=N-1; i>=0; i--) {
                    arr[i][j] = num;
                    num++;
                }
            }
                
        }

        // 출력
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}