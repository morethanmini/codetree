import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> lst = new ArrayList<>();

        for (int i=0; i<10; i++) {
            lst.add(br.readLine());
        }

        char c = br.readLine().charAt(0);

        // System.out.println(lst);
        // System.out.println(c);
        int cnt = 0;

        for (int i=0; i<10; i++) {
          
            // System.out.println(lst.get(i).charAt(lst.get(i).length() - 1));
            if (lst.get(i).charAt(lst.get(i).length() - 1) == c) {
                System.out.println(lst.get(i));
                cnt++;
            }
        }

        if (cnt == 0)
            System.out.println("None");
    }
}