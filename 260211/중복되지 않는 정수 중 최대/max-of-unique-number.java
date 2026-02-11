import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());
            countMap.put(value, countMap.getOrDefault(value, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        boolean found = false;

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) { // 한 번만 나온 값
                max = Math.max(max, entry.getKey());
                found = true;
            }
        }

        System.out.println(found ? max : -1);
    }
}
