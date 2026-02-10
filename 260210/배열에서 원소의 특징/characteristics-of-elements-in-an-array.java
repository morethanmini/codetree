import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[10];

        for(int i=0; i<10; i++) {
            int value = Integer.parseInt(st.nextToken());

            arr[i] = value;

            if (value % 3 == 0){
                System.out.println(arr[i-1]);
                break;
            }
                
        }
    }
}