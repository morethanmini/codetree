import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[100];
        int cnt = 0;

        
        while (st.hasMoreTokens()) {
            arr[cnt++] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<arr.length; i++) {
            if (arr[i] == 0) {
                break;
            }

            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + 3 + " ");
            }
            else
                System.out.print(arr[i] / 2 + " ");

        }


    }
}