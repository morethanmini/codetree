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
            for(int j=0; j<a-i; j++) {
                System.out.print("*");

            }

            for(int j=1; j<2*i+1; j++) {
                System.out.print(" ");
            }

            for(int j=0; j<a-i; j++) {
                System.out.print("*");
            }
            


            System.out.println();
        }
        

    }
}

// 별 공백 별
// 4  0   4
// 3  1   3
// 2  3   2
// 1  5   1
