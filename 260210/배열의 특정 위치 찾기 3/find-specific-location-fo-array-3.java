import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[100];

        for (int i = 0; i < 100; i++) {
            int value = Integer.parseInt(st.nextToken());
            arr[i] = value;

            if (value == 0) {
                if (i >= 3) {
                    System.out.println(arr[i-1] + arr[i-2] + arr[i-3]);
                }
                break;
            }
        }
    }
}
