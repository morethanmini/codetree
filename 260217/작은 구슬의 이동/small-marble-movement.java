import java.util.Scanner;

public class Main {
    static int N, T;

    // dir: 0=U, 1=R, 2=D, 3=L  (행/열 기준)
    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, 1, 0, -1};

    static boolean inRange(int r, int c) {
        return 0 <= r && r < N && 0 <= c && c < N;
    }

    static int toDir(char ch) {
        if (ch == 'U') return 0;
        if (ch == 'R') return 1;
        if (ch == 'D') return 2;
        return 3; // 'L'
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        T = sc.nextInt();

        int R = sc.nextInt();
        int C = sc.nextInt();
        char D = sc.next().charAt(0);

        // 1-based -> 0-based
        int r = R - 1;
        int c = C - 1;
        int dir = toDir(D);

        for (int t = 0; t < T; t++) {
            int nr = r + dr[dir];
            int nc = c + dc[dir];

            // 다음 칸이 밖이면 방향만 반전 (이 초에는 이동 없음)
            if (!inRange(nr, nc)) {
                dir = (dir + 2) % 4;
            } else {
                r = nr;
                c = nc;
            }
        }

        // 0-based -> 1-based (행, 열 순서로 출력)
        System.out.println((r + 1) + " " + (c + 1));
    }
}
