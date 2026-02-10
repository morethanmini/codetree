import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[] cntArr = new int[10];
        int n1 = A;

        while (n1 > 0) {
            int remainder = n1 % B;   // 나머지
            cntArr[remainder]++;      // 등장 횟수 증가
            n1 = n1 / B;              // 몫 저장
        }

        int sum = 0;
        for (int i = 0; i < cntArr.length; i++) {
            sum += cntArr[i] * cntArr[i];
        }

        System.out.println(sum);
    }
}
