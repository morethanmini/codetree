import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[100];
        int[] cntArr = new int[7];

        for (int i=0; i<10; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i=0; i<10; i++) {
            cntArr[arr[i]]++;
        }

        // System.out.println(Arrays.toString(cntArr));

        for(int i=1; i<cntArr.length; i++) {
            System.out.println(i + " - " + cntArr[i]);
        }
    }
}