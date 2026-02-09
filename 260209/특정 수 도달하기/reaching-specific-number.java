import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        // 최대 10개의 정수 처리
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();

            // 250 이상이 나오면 마지막 수는 제외하고 종료
            if (n >= 250) {
                break;
            }

            sum += n;
            count++;
        }

        // 평균 계산
        double average = (count > 0) ? (double) sum / count : 0.0;

        System.out.println(sum + " " + average);
    }
}
