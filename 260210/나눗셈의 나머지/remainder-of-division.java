import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[] cntArr = new int[10];
        int n1 = A; // 몫
        int n2 = 0; // 나머지


        while (n1 > 0) {
            n2 = n1 % B;     // 나머지
            cntArr[n2]++;    // 개수 증가
            n1 = n1 / B;     // 몫 갱신
        }

        
        // System.out.println(Arrays.toString(cntArr));

        int sum = 0;

        for(int i=0; i<cntArr.length; i++) {
            sum += cntArr[i] * cntArr[i];   
        }
        System.out.println(sum);
    }
}