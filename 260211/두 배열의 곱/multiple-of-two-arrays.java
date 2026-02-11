import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] a = new int[3][3];
        int[][] b = new int[3][3];

        // 첫 번째 3x3 입력
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 빈 줄 하나 소비
        br.readLine();

        // 두 번째 3x3 입력
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                b[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] v = new int[3][3];

        // 원소별 곱 출력
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                v[i][j] = a[i][j] * b[i][j];
                
                System.out.print(v[i][j] + " ");
            }
            System.out.println();
        }

    }
}
