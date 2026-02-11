import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];
        int num = 1;

        // 1. 윗줄 시작
        for (int startCol = 0; startCol < M; startCol++) {
            int i = 0;
            int j = startCol;

            while (i < N && j >= 0) {
                arr[i][j] = num++;
                i++;
                j--;
            }
        }

        // 2. 오른쪽 열 시작 (첫 행 제외)
        for (int startRow = 1; startRow < N; startRow++) {
            int i = startRow;
            int j = M - 1;

            while (i < N && j >= 0) {
                arr[i][j] = num++;
                i++;
                j--;
            }
        }

        // 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
