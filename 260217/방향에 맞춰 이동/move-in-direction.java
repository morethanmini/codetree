import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 동, 서, 남, 북
        int[] dx = new int[]{1, -1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};

        int x = 0, y = 0;

        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();

            int dir = -1;

            if (direction == 'E') {
                dir = 0;
            } else if (direction == 'W') {
                dir = 1;
            } else if (direction == 'S') {
                dir = 2;
            } else if (direction == 'N') {
                dir = 3;
            }

            // 이동 결과를 먼저 계산
            int nx = x + dx[dir] * distance;
            int ny = y + dy[dir] * distance;

            // 기존 방식: 계산 후 반영
            x = nx;
            y = ny;
        }

        System.out.println(x + " " + y);
    }
}
