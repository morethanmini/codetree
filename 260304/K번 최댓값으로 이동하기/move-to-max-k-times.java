import java.io.*;
import java.util.*;

public class Main {

    static int n, k;
    static int r, c;

    static int[][] grid;
    static boolean[][] visited;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static boolean inRange(int x, int y){
        return x>=0 && x<n && y>=0 && y<n;
    }

    static int[] BFS(){

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{r,c});
        visited[r][c] = true;

        int maxValue = -1;
        int maxX = r;
        int maxY = c;

        while(!q.isEmpty()){

            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            for(int dir=0; dir<4; dir++){

                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if(!inRange(nx,ny)) continue;
                if(visited[nx][ny]) continue;

                if(grid[nx][ny] < grid[r][c]){

                    visited[nx][ny] = true;
                    q.offer(new int[]{nx,ny});

                    if(grid[nx][ny] > maxValue){
                        maxValue = grid[nx][ny];
                        maxX = nx;
                        maxY = ny;
                    }
                    else if(grid[nx][ny] == maxValue){
                        if(nx < maxX || (nx == maxX && ny < maxY)){
                            maxX = nx;
                            maxY = ny;
                        }
                    }
                }
            }
        }

        if(maxValue == -1) return null;

        return new int[]{maxX, maxY};
    }

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        grid = new int[n][n];

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken())-1;
        c = Integer.parseInt(st.nextToken())-1;

        for(int i=0;i<k;i++){

            visited = new boolean[n][n];

            int[] next = BFS();

            if(next == null) break;

            r = next[0];
            c = next[1];
        }

        System.out.println((r+1)+" "+(c+1));
    }
}