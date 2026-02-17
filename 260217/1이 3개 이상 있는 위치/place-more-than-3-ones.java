import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.

        // 상하좌우
        int[] dx = new int[] {-1, 1 ,0, 0};
        int[] dy = new int[] {0, 0, -1, 1};

        int cnt = 0;

        for (int x=0; x<n; x++) {
            for (int y=0; y<n; y++) {
                // int cur = arr[x][y];

                int temp = 0;
                
                for (int k=0; k<4; k++) {
                    int nx = x + dx[k];
                    int ny = y + dy[k];

                    if (nx>=0 && nx<n && ny>=0 && ny<n) {
                        if (arr[nx][ny] == 1) {
                            temp++;
                        }
                    }
                }

                if (temp >= 3) {
                    cnt++;
                }


            }

        }

        System.out.println(cnt);
    }
}