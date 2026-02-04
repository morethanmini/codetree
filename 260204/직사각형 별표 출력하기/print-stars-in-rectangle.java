import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        // System.out.println(N + "," + M);
    
        for(int i=1; i<=N; i++) {
            for(int j=1; j<=M; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}