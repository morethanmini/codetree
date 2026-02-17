import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] grid = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }
        // Please write your code here.
        
        // 1. (0,0) 에서 시작함

        // 2. 다음 좌표는 x + 1, y + 1 이상만 가능함

        // 3. 다음 좌표는 현재 색깔과 달라야함

        // 4. (n, n) 위치까지 가능 방법이 최대 몇개인가?

        int cnt = 0;

        for (int i=1; i<n; i++) {
            for (int j=1; j<m; j++) {
                for (int k=i+1; k<n-1; k++) {
                    for (int l=j+1; l<m-1; l++) {
                        if (grid[0][0] != grid[i][j] &&
                            grid[i][j] != grid[k][l] &&
                            grid[k][l] != grid[n-1][m-1]) {
                                cnt++;
                            }
                    }
                }
            }
        }

        System.out.println(cnt);

    }
}