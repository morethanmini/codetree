import java.util.Scanner;

public class Main {
    public static int n;
    public static int[] dx = {-1, 0, 1, 0}; // U R D L
    public static int[] dy = {0, 1, 0, -1};

    public static boolean inRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int t = sc.nextInt();
        String commands = sc.next();

        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        char[] c = commands.toCharArray();

        // 시작 위치 초기화
        int x = n / 2;
        int y = n / 2;
        int dirNum = 0;

        int sum = board[x][y]; // 시작 위치 값 포함

        for (int i = 0; i < t; i++) {
            if (c[i] == 'L') {
                dirNum = (dirNum - 1 + 4) % 4;
            } 
            else if (c[i] == 'R') {
                dirNum = (dirNum + 1) % 4;
            } 
            else if (c[i] == 'F') {
                int nx = x + dx[dirNum];
                int ny = y + dy[dirNum];

                if (inRange(nx, ny)) {
                    x = nx;
                    y = ny;
                    sum += board[x][y]; // 이동 성공 시만 더함
                }
            }
        }

        System.out.println(sum);
    }
}
