import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int[][] grid;
    static boolean[][] visited;

    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };

    static boolean inRange(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n;
    }

    static boolean canGo(int x, int y) {
        if (!inRange(x, y))
            return false;
        if (visited[x][y])
            return false;
        return true;
    }

    static int DFS(int x, int y) {
        visited[x][y] = true;
        int count = 1;

        for (int dir = 0; dir < 4; dir++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (canGo(nx, ny) && grid[x][y] == grid[nx][ny]) {
                count += DFS(nx, ny);
            }
        }
        return count;
    }

    static class Result {
        int value; // 크기 4이상 블록 개수
        int count; // 가장 큰 블록 크기

        Result(int value, int count) {
            this.value = value;
            this.count = count;
        }

        @Override
        public String toString() {
            return value + " " + count;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        grid = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int blockCountOver4 = 0;
        int maxBlockSize = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (!visited[i][j]) {
                    int size = DFS(i, j);

                    if (size >= 4) {
                        blockCountOver4++;
                    }

                    maxBlockSize = Math.max(maxBlockSize, size);
                }
            }
        }

        Result result = new Result(blockCountOver4, maxBlockSize);
        System.out.println(result);
    }
}