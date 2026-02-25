import java.util.*;
import java.io.*;

public class Main {

    public static int n, m;
    public static int[][] grid;

    public static int[][][] shapes = new int[][][]{
        {
            {1,1,0},
            {1,0,0},
            {0,0,0}
        },
        {
            {1,1,0},
            {0,1,0},
            {0,0,0}
        },
        {
            {1,0,0},
            {1,1,0},
            {0,0,0}
        },
        {
            {0,1,0},
            {1,1,0},
            {0,0,0}
        },
        {
            {1,1,1},
            {0,0,0},
            {0,0,0}
        },
        {
            {1,0,0},
            {1,0,0},
            {1,0,0}
        }
    };

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < m;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        grid = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                for (int s = 0; s < shapes.length; s++) {

                    int sum = 0;
                    boolean valid = true;

                    for (int x = 0; x < 3; x++) {
                        for (int y = 0; y < 3; y++) {

                            if (shapes[s][x][y] == 1) {

                                int nx = i + x;
                                int ny = j + y;

                                if (!inRange(nx, ny)) {
                                    valid = false;
                                    break;
                                }

                                sum += grid[nx][ny];
                            }
                        }
                        if (!valid) break;
                    }

                    if (valid) {
                        answer = Math.max(answer, sum);
                    }
                }
            }
        }

        System.out.println(answer);
    }
}