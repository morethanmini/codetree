import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        
        int cnt = 0;

        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

            if (cnt == 3) {
                System.out.println(i);
                break;
            }

            if (arr[i] == 2) {
                cnt++;
            }

            
        
        }
    }
}