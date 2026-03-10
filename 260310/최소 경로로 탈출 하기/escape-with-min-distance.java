import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static int[][] grid;
    static int[][] dist;
    static boolean[][] visited;

    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };

    static boolean inRange(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }

    static void bfs() {

        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[] { 0, 0 });

        visited[0][0] = true;
        dist[0][0] = 0;

        while (!q.isEmpty()) {

            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            for (int d = 0; d < 4; d++) {

                int nx = x + dx[d];
                int ny = y + dy[d];

                if (!inRange(nx, ny))
                    continue;
                if (visited[nx][ny])
                    continue;
                if (grid[nx][ny] == 0)
                    continue;

                visited[nx][ny] = true;
                dist[nx][ny] = dist[x][y] + 1;

                q.offer(new int[] { nx, ny });
            }
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        grid = new int[n][m];
        dist = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {

                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bfs();

        if (visited[n - 1][m - 1])
            System.out.println(dist[n - 1][m - 1]);
        else
            System.out.println(-1);
    }
}