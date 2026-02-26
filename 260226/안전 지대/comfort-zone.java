import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static int[][] grid;
    static boolean[][] visited;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static boolean inRange(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }

    static void dfs(int x, int y, int rainHeight) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (inRange(nx, ny)
                    && !visited[nx][ny]
                    && grid[nx][ny] > rainHeight) {
                dfs(nx, ny, rainHeight);
            }
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        grid = new int[n][m];

        int maxHeight = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
                maxHeight = Math.max(maxHeight, grid[i][j]);
            }
        }

        int maxSafeAreaCount = 0;
        int bestRainHeight = 0;

        for (int rain = 0; rain <= maxHeight; rain++) {

            visited = new boolean[n][m];
            int safeAreaCount = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {

                    if (!visited[i][j] && grid[i][j] > rain) {
                        dfs(i, j, rain);
                        safeAreaCount++;
                    }
                }
            }

            if (safeAreaCount >= maxSafeAreaCount) {
                maxSafeAreaCount = safeAreaCount;
                bestRainHeight = rain;
            }
        }

        System.out.println(maxSafeAreaCount + " " + bestRainHeight);
    }
}