import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c = br.readLine().charAt(0);

        String[] s = {"apple", "banana", "grape", "blueberry", "orange"};

        int cnt = 0;

        for(int i=0; i<s.length; i++) {
            for (int j=2; j<4; j++) {
                if (s[i].charAt(j) == c) {
                    System.out.println(s[i]);
                    cnt++;
                }

            }
        }
        System.out.println(cnt);

    }
}