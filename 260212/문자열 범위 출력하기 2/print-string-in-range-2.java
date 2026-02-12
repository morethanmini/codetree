import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i=s.length()-1; i>=0; i--) {
            System.out.print(s.charAt(i));
            cnt++;

            if (cnt == n) {
                break;
            } 
        }
    }
}