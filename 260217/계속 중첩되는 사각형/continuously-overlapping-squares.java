import java.util.Scanner;

public class Main {
    public static final int OFFSET = 100;
    public static final int SIZE = 201;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 0: 없음, 1: 빨강, 2: 파랑
        int[][] arr = new int[SIZE][SIZE];

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            int color = (i % 2 == 0) ? 1 : 2; // 빨강 -> 파랑 -> 빨강 ...

            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    arr[x][y] = color; // 마지막 색으로 덮어쓰기
                }
            }
        }

        int cnt = 0;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (arr[i][j] == 2) { // 파랑만 카운트
                    cnt++;
                }
            }
        }

        System.out.print(cnt);
    }
}
