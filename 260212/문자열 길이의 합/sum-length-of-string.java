import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int cnt = 0;

        for (int i=0; i<N; i++) {
            String s = br.readLine();
            if(s.charAt(0) == 'a') { 
                cnt++;
            }

            sum += s.length();
        }

        System.out.println(sum + " " + cnt);



    }
}