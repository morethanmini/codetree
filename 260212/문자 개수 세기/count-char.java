import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        char N = br.readLine().charAt(0);
        int cnt = 0;

        for (int i=0; i<s.length(); i++) {   
            if (s.charAt(i) == N) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}