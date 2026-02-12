import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> lst = new ArrayList<>();

        for(int i=0; i<4; i++) {
            String s = br.readLine();
            lst.add(s);
        }

        // System.out.println(lst);

        for (int i=3; i>=0; i--) {
            System.out.println(lst.get(i));
        }
    }
}