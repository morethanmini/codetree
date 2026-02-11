import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i=0; i<4; i++) {
            int sum = 0;

            st = new StringTokenizer(br.readLine());
            
            for (int j=0; j<4; j++) {
                int value = Integer.parseInt(st.nextToken());

                sum += value;
            }

            System.out.println(sum);
        }
    }
}