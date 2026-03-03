import java.util.*;
import java.io.*;

public class Main {
    public static int n, m;
    public static int[][] grid;
    public static boolean[][] visited;

    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};

    public static boolean inRange(int x, int y) {
        return x>=0 && x<n && y>=0 && y<m;
    }

    public static boolean canGo(int x, int y) {
        if (!inRange(x, y)) return false;
        if (grid[x][y]==0 || visited[x][y]) return false;
        return true;
    }

    public static void BFS(int x, int y) {
        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[] {x, y});
        visited[x][y] = true;

        while(!q.isEmpty()) {
            int[] node = q.poll();

            for (int dir=0; dir<4; dir++) {
                int nx = node[0] + dx[dir];
                int ny = node[1] + dy[dir];

                if (canGo(nx, ny)) {
                    visited[nx][ny] = true;
                    q.offer(new int[] {nx,ny});
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        grid = new int[n][m];
        visited = new boolean[n][m];   // 반드시 필요

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        if (grid[0][0] == 1) {
            BFS(0, 0);   // 한 번만 실행
        }

        int answer = visited[n - 1][m - 1] ? 1 : 0;
        System.out.println(answer);
    }
}