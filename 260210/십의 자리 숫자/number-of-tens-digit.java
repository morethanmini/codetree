import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[100];
        int[] cntArr = new int[10];

        int count = 0;

        while (st.hasMoreTokens()) {
            arr[count++] = Integer.parseInt(st.nextToken());
        }

        for (int i=0; i<100; i++) {
            if (arr[i] == 0)
                break;
            
            cntArr[arr[i] / 10]++;
        }

        // System.out.println(Arrays.toString(cntArr));
        for (int i=1; i<cntArr.length; i++) {
            System.out.println(i + " - " + cntArr[i]);
        }
    }
}