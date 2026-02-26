import java.io.*;
import java.util.*;

public class Main {
    public static final int DIR_NUM = 4;
    public static final int MAX_M = 50;
    public static final int MAX_N = 50;
    
    public static int n, m;
    public static int[][] grid = new int[MAX_N][MAX_M];
    public static boolean[][] visited = new boolean[MAX_N][MAX_M];
    public static int zoneNum;
    public static int maxHeight = 0;

    public static void initializeVisited() {
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                visited[i][j] = false;
    }
    
    public static boolean inRange(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }
    
    public static boolean canGo(int x, int y, int k) {
        if(!inRange(x, y)) return false;
        if(visited[x][y] || grid[x][y] <= k) return false;
        return true;
    }
    
    public static void DFS(int x, int y, int k) {
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        
        for(int dir = 0; dir < DIR_NUM; dir++) {
            int newX = x + dx[dir];
            int newY = y + dy[dir];
    
            if(canGo(newX, newY, k)){
                visited[newX][newY] = true;
                DFS(newX, newY, k);
            }
        }
    }
    
    public static void getZoneNum(int k) {
        zoneNum = 0;
        initializeVisited();
        
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++) {
                if(canGo(i, j, k)) {
                    visited[i][j] = true;
                    zoneNum++;
                    DFS(i, j, k);
                }
            }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int maxZoneNum = -1; 
        int answerK = 0;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
                maxHeight = Math.max(maxHeight, grid[i][j]);
            }
        }

        // k = 0부터 시작
        for(int k = 0; k <= maxHeight; k++){
            getZoneNum(k);

            if(zoneNum >= maxZoneNum) {
                maxZoneNum = zoneNum;
                answerK = k;
            }
        }

        System.out.print(answerK + " " + maxZoneNum);
    }
}