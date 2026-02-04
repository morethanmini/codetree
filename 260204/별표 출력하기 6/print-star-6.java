import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        // int b = Integer.parseInt(st.nextToken());

        for(int i=0; i<a; i++) {
            for(int j=0; j<i; j++) {
                System.out.print("  ");
            }

            for(int j=0; j<=(a-i*2)+2; j++) {
                System.out.print("* ");
            }

            System.out.println();

            
        }

        for(int i=0; i<a-1; i++) {
            for(int j=0; j<a-i-2; j++) {
                System.out.print("  ");
            }

            for(int j=0; j<(2*i)+3; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }


    }
}

// 별 공백
// 7  0
// 5  1
// 3  2
// 1  3
// -----
// 3  2
// 5  1
// 7  0