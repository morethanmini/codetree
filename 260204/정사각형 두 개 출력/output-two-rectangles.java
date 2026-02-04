import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        // int b = Integer.parseInt(st.nextToken());
        for(int i=1; i<=a; i++) {
            for(int j=1; j<=a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=1; i<=a; i++) {
            for(int j=1; j<=a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}