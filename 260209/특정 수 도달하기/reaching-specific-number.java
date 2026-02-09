import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        boolean stopped = false;

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();

            if (!stopped) {
                if (n >= 250) {
                    stopped = true; // 이 값(마지막으로 주어진 수)은 제외
                } else {
                    sum += n;
                    count++;
                }
            }
        }

        double avg = (count == 0) ? 0.0 : (double) sum / count;
        System.out.printf("%d %.1f%n", sum, avg);
    }
}
