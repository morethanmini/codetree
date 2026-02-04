import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        // int b = Integer.parseInt(st.nextToken());

        for (int i=a; i>=1; i--) {
	        for (int j=0; j<i; j++) {
                for (int k=0; k<i; k++) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        

        }
    }
}