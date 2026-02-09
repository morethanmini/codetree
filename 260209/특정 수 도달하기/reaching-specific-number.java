import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> lst = new ArrayList<>();

        String[] arr = br.readLine().split(" ");
        int sum = 0;
        int cnt = 0;

        // for문 돌면서 앞에서부터 검사
        for(int i=0; i<arr.length; i++) {
            int value = Integer.parseInt(arr[i]);

            // 250 이상 나오면 그 이전까지만 사용
            if (value >= 250)
                break;

            sum += value;
            cnt++;

        }

        // 끝까지 없으면 10개 모두 사용
        double avg = (cnt == 0) ? 0 : (double) sum / cnt;

        // 합과 평균 출력
        System.out.println(sum + " " + avg);

    }
}