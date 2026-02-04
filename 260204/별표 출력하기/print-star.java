import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        // int b = Integer.parseInt(st.nextToken());

        for (int i=1; i<=a; i++) {
            for (int j=0; j<i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i=a-1; i>=1; i--) {
            for (int j=0; j<i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}