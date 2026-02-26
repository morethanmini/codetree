import java.util.*;
import java.io.*;

public class Main {
    public static int n, m;
    public static int[][] grid;
    public static boolean[][] visited;
    public static boolean canReach = false;

    static int[] dx = {1, 0};
    static int[] dy = {0, 1};

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < m;
    }

    public static void DFS(int x, int y) {
        if (x == n - 1 && y == m - 1) {
            canReach = true;
            return;
        }

        visited[x][y] = true;

        for (int i = 0; i < 2; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (inRange(nx, ny) && !visited[nx][ny] && grid[nx][ny] == 1) {
                DFS(nx, ny);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        grid = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        if (grid[0][0] == 1) {
            DFS(0, 0);
        }

        System.out.println(canReach ? 1 : 0);
    }
}