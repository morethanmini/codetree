import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[]arr = new int[100];

        for(int i=0; i<N; i++) {
            int value = Integer.parseInt(st.nextToken());

            System.out.print(value * value + " ");
        }


    }
}