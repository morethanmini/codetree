import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> list = new ArrayList<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            list.add(num);

            // 홀수 개일 때만 중앙값 계산
            if ((i + 1) % 2 == 1) {
                List<Integer> temp = new ArrayList<>(list);
                Collections.sort(temp);
                result.append(temp.get(temp.size() / 2)).append(" ");
            }
        }

        System.out.println(result.toString().trim());
    }
}
