import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] x1 = new int[n];
        int[] x2 = new int[n];

        int maxCoord = 0;

        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            maxCoord = Math.max(maxCoord, x2[i]);
        }

        int[] arr = new int[maxCoord];

        // 구간 카운팅
        for (int i = 0; i < n; i++) {
            for (int j = x1[i]; j <= x2[i]; j++) {
                arr[j - 1]++;
            }
        }

        // 최대 겹침 개수 계산
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer = Math.max(answer, arr[i]);
        }

        System.out.println(answer);
    }
}
