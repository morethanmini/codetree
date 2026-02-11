import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int[] arr = new int[100];
        int idx = 0;

        while (st.hasMoreTokens()) {
            int value = Integer.parseInt(st.nextToken());

            if (value == 999 || value == -999)
                break;

            arr[idx++] = value;
        }

        // 입력된 개수까지만 순회
        for(int i = 0; i < idx; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        System.out.println(max + " " + min);
    }
}
