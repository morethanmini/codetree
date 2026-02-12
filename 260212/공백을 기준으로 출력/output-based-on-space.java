import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        

        for (int i=0; i<2; i++) {
            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                String s = st.nextToken();
                System.out.print(s);
            }

            
        }
    }
}