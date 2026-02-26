import java.util.*;
import java.io.*;

public class Main {
    public static int n, m;
    public static final int MAX_NUM = 100;

    public static int[][] grid = new int[MAX_NUM][MAX_NUM];
    public static int[][] visited = new int[MAX_NUM][MAX_NUM];

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < m;
    }

    public static boolean run(int x, int y) {
        if (!inRange(x, y)) return false;
        if (visited[x][y] == 1 || grid[x][y] == 0) return false;
        return true;
    }

    public static void DFS(int x, int y) {
        int[] dx = {1, 0};
        int[] dy = {0, 1};

        visited[x][y] = 1;

        for (int i = 0; i < 2; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (run(nx, ny)) {
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

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visited[0][0] = 1;
        DFS(0, 0);

        System.out.println(visited[n-1][m-1]);
    }
}