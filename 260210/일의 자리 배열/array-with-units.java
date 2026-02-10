import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] arr = new int[10];

        arr[0] = a;
        arr[1] = b;

        // System.out.println(Arrays.toString(arr));
        System.out.print(arr[0] + " " + arr[1] + " ");

        for (int i=2; i<10; i++) {
            arr[i] = (arr[i-2] + arr[i-1]) % 10;

            System.out.print(arr[i] + " ");
        }

    }
}