import java.io.*;
import java.util.*;

public class Main {
    public static int n, m;
    public static int zoneNum;
    public static final int MAX_HEIGHT = 100;
    public static final int MAX_M = 50;
    public static final int MAX_N = 50;

    public static int[][] grid = new int[MAX_N][MAX_M];
    public static boolean[][] visited = new boolean[MAX_N][MAX_M];

    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};

    public static boolean inRange(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }

    public static boolean canGo(int x, int y, int k) {
        if (!inRange(x, y))
            return false;

        if (visited[x][y] || grid[x][y] <= k)
            return false;

        return true;
    }

    public static void DFS(int x, int y, int k) {
        visited[x][y] = true;

        for (int dir = 0; dir < 4; dir++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (canGo(nx, ny, k)) {
                DFS(nx, ny, k);
            }
        }
    }

    // visited 배열을 초기화해줍니다.
    public static void initializeVisited() {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                visited[i][j] = false;
    }
    
    public static void getZoneNum(int k) {
        // 새로운 탐색을 시작한다는 의미로 zoneNum를 0으로 갱신하고
        // visited 배열을 초기화해줍니다.
        zoneNum = 0;
        initializeVisited();

        // 격자의 각 위치에 대하여 탐색을 시작할 수 있는 경우
        // 해당 위치로부터 시작한 DFS 탐색을 수행합니다.
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                if (canGo(i, j, k)) {
                    // 해당 위치를 탐색할 수 있는 경우 visited 배열을 갱신하고
                    // 안전 영역을 하나 추가해줍니다.
                    visited[i][j] = true;
                    zoneNum++;

                    DFS(i, j, k);
                }
            }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int maxZoneNum = -1;
        int answerK = 0;

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 각 가능한 비의 높이에 대하여 안전 영역의 수를 탐색합니다.
        for (int k = 1; k <= MAX_HEIGHT; k++) {
            getZoneNum(k);

            // 기존의 최대 영역의 수보다 클 경우 이를 갱신하고 인덱스를 저장합니다.
            if (zoneNum > maxZoneNum) {
                maxZoneNum = zoneNum;
                answerK = k;
            }
        }

        System.out.print(answerK + " " + maxZoneNum);

    }
}
