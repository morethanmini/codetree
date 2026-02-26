import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static final int MAX_NUM = 25;
    public static int[][] grid = new int[MAX_NUM][MAX_NUM];
    public static boolean[][] visited = new boolean[MAX_NUM][MAX_NUM];

    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    public static int DFS(int x, int y) {
        visited[x][y] = true;
        int count = 1;   // 현재 칸 포함

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (inRange(nx, ny) && 
                !visited[nx][ny] && 
                grid[nx][ny] == 1) {

                count += DFS(nx, ny);
            }
        }

        return count;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    result.add(DFS(i, j));
                }
            }
        }

        Collections.sort(result);

        System.out.println(result.size());   // 덩어리 개수
        for (int size : result) {
            System.out.println(size);        // 각 덩어리 크기
        }
    }
}