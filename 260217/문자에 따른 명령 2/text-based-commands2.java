import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char[] c = s.toCharArray();

        // 동, 남, 서, 북 (시계방향)
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};

        int x = 0, y = 0;
        int dirNum = 3; // 초기방향 : 북

        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'L') {
                dirNum = (dirNum - 1 + 4) % 4;
            } 
            else if (c[i] == 'R') {
                dirNum = (dirNum + 1) % 4;
            } 
            else if (c[i] == 'F') {
                int nx = x + dx[dirNum];
                int ny = y + dy[dirNum];

                // 이동 반영
                x = nx;
                y = ny;
            }
        }

        System.out.println(x + " " + y);
    }
}
