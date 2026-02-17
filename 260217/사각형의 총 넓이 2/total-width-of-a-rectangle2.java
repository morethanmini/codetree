import java.util.*;

public class Main {
    public static final int OFFSET = 100;
    public static final int SIZE = 201;   // 좌표 범위 -100 ~ 100 → 0 ~ 200

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[SIZE][SIZE];

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            // 직사각형 영역 칠하기 (반열림 구간)
            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    arr[x][y]++;
                }
            }
        }

        // System.out.println(Arrays.deepToString(arr));

        int cnt = 0;

        for (int i=0; i<SIZE; i++) {
            for (int j=0; j<SIZE; j++) {
                if (arr[i][j] != 0)
                    cnt++;
            }
        }
        System.out.println(cnt);
    }
}
