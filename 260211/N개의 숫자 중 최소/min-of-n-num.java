import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine().trim());
        st = new StringTokenizer(br.readLine());

        int minVal = Integer.MAX_VALUE;
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (num < minVal) {
                minVal = num;
                cnt = 1;          // 새로운 최소값 발견 → 개수 초기화
            } else if (num == minVal) {
                cnt++;            // 현재 최소값과 같으면 개수 증가
            }
        }

        System.out.print(minVal + " " + cnt);
    }
}
