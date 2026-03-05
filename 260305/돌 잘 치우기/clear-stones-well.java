import java.io.*;
import java.util.*;

public class Main {

    static int n, k, m;
    static int[][] grid;
    static boolean[][] visited;

    static List<int[]> stones = new ArrayList<>();
    static List<int[]> starts = new ArrayList<>();

    static int maxSize = 0;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static boolean inRange(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n;
    }

    static boolean canGo(int x, int y) {
        if (!inRange(x, y)) return false;
        if (visited[x][y]) return false;
        if (grid[x][y] == 1) return false;
        return true;
    }

    static int BFS() {

        visited = new boolean[n][n];
        Queue<int[]> q = new ArrayDeque<>();

        int size = 0;

        for (int[] s : starts) {
            int x = s[0];
            int y = s[1];

            if (!visited[x][y] && grid[x][y] == 0) {
                visited[x][y] = true;
                q.offer(new int[]{x, y});
                size++;
            }
        }

        while (!q.isEmpty()) {

            int[] cur = q.poll();

            for (int d = 0; d < 4; d++) {

                int nx = cur[0] + dx[d];
                int ny = cur[1] + dy[d];

                if (canGo(nx, ny)) {
                    visited[nx][ny] = true;
                    q.offer(new int[]{nx, ny});
                    size++;
                }
            }
        }

        return size;
    }

    static void choose(int start, int count) {

        if (count == m) {   // 제거할 돌 개수
            int size = BFS();
            maxSize = Math.max(maxSize, size);
            return;
        }

        for (int i = start; i < stones.size(); i++) {

            int x = stones.get(i)[0];
            int y = stones.get(i)[1];

            grid[x][y] = 0;

            choose(i + 1, count + 1);

            grid[x][y] = 1;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken()); // 시작점 개수
        m = Integer.parseInt(st.nextToken()); // 제거할 돌 개수

        grid = new int[n][n];

        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {

                grid[i][j] = Integer.parseInt(st.nextToken());

                if (grid[i][j] == 1) {
                    stones.add(new int[]{i, j});
                }
            }
        }

        for (int i = 0; i < k; i++) {   // 시작점 개수

            st = new StringTokenizer(br.readLine());

            int r = Integer.parseInt(st.nextToken()) - 1;
            int c = Integer.parseInt(st.nextToken()) - 1;

            starts.add(new int[]{r, c});
        }

        choose(0, 0);

        System.out.println(maxSize);
    }
}