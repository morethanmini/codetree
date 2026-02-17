import java.util.Scanner;

public class Main {
    // 상 우 하 좌
    public static int[] dr = new int[] {-1, 0, 1, 0};
    public static int[] dc = new int[] {0, 1, 0, -1};
    public static int N, T;

    // isRange
    public static boolean isRange(int x, int y) {
        return 0<=x && x<N && 0<=y && y<N;
    }

    // toDir
    public static int toDir(char c) {
        if (c == 'U') return 0;
        if (c == 'R') return 1;
        if (c == 'D') return 2;
        return 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        T = sc.nextInt();
        int R = sc.nextInt();
        int C = sc.nextInt();
        char D = sc.next().charAt(0);
        // Please write your code here.

        // 1. 좌표 -> 인덱스 변환
        int r = R-1;
        int c = C-1;
        int dir = toDir(D);

        // 2. T초 동안
        for (int t=0; t<T; t++) {

        // 3. next 좌표 확인
            int nr = r + dr[dir];
            int nc = c + dc[dir];

                // 4. isRange(next)
                if (!isRange(nr, nc)) { // 5. if 벽이면 방향 전환
                    dir = (dir+2) % 4;
                } else {  // else go
                    r = nr;
                    c = nc;
                }
        }
        System.out.print((r+1) + " " + (c+1));
    }
}