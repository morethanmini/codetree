import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        double sum = 0;  // double로 변경

        for (int i = 0; i < N; i++) {
            sum += Double.parseDouble(arr[i]);  // 여기 수정
        }

        double avg = sum / N;

        if (avg >= 4.0)
            System.out.printf("%.1f\nPerfect", avg);
        else if (avg >= 3.0)
            System.out.printf("%.1f\nGood", avg);
        else
            System.out.printf("%.1f\nPoor", avg);
    }
}
