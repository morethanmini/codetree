import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                int sum = 0; // 조합마다 합 초기화

                for (int k = 0; k < n; k++) {
                    if (k != i && k != j) {
                        sum += arr[k];
                    }
                }

                int diff = Math.abs(sum - s); // s와의 차이 계산
                minDiff = Math.min(minDiff, diff);
            }
        }

        System.out.println(minDiff);
    }
}
