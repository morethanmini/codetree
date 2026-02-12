import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        // System.out.println(s.charAt(0));
        for (int i=2; i<10; i++) {
            System.out.print(s.charAt(i));
        }
    }
}