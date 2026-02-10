import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[100];
        int[] cntArr = new int[10];

        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        for (int i=0; i<N; i++) {
            cntArr[arr[i]]++;
        }

        for (int i=1; i<cntArr.length; i++) {
            System.out.println(cntArr[i]);
        }


    }
}