import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sumEvenPos = 0;   // 짝수번째 합
        int sumMul3Pos = 0;   // 3의 배수번째 합
        int countMul3 = 0;

        for (int i = 0; i < 10; i++) {
            int value = Integer.parseInt(st.nextToken());

            // 짝수번째 (1-based 기준 → i+1)
            if ((i + 1) % 2 == 0) {
                sumEvenPos += value;
            }

            // 3의 배수번째
            if ((i + 1) % 3 == 0) {
                sumMul3Pos += value;
                countMul3++;
            }
        }

        double avg = (double) sumMul3Pos / countMul3;
        System.out.printf("%d %.1f", sumEvenPos, avg);
    }
}
