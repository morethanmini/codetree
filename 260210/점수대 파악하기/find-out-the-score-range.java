import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[100];
        int[] cntArr = new int[11];
        int cnt = 0;

        while (st.hasMoreTokens()) {
            arr[cnt++] = Integer.parseInt(st.nextToken());
        }

        // System.out.println(Arrays.toString(arr));

        for (int i=0; i<100; i++) {
            if (arr[i] == 0)
                break;
            
            cntArr[arr[i] / 10]++;
        }

        // System.out.println(Arrays.toString(cntArr));

        for (int i=10; i>=1; i--) {
            System.out.println(i*10 + " - " + cntArr[i]);
        }
    }
}