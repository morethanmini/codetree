import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] result = new int[N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());

            if (value % 2 == 0) {
                result[count++] = value;
            }
        }

        for (int i = count - 1; i >= 0; i--) {
            System.out.print(result[i] + " ");
        }
    }
}
