import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String[] arr = new String[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = st.nextToken();
        }

        
        for (int j=9; j>=0; j--) {
            System.out.print(arr[j] + "");
        }
    }
}
