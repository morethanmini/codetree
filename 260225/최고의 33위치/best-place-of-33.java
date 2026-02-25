import java.util.*;

public class Main {
    static int n;

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] grid = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int sum = 0;
                boolean valid = true;

                for (int dx = 0; dx < 3; dx++) {
                    for (int dy = 0; dy < 3; dy++) {
                        int nx = i + dx;
                        int ny = j + dy;

                        if (!inRange(nx, ny)) {
                            valid = false;
                            break;
                        }

                        sum += grid[nx][ny];
                    }
                    if (!valid) break;
                }

                if (valid) {
                    max = Math.max(max, sum);
                }
            }
        }

        System.out.println(max);
    }
}