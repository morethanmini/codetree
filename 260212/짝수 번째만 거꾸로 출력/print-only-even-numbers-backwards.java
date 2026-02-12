import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        List<Character> lst = new ArrayList<>();

        for (int i=1; i<s.length(); i+=2) {
            lst.add(s.charAt(i));
        }

        Collections.reverse(lst);

        for(int i=0; i<lst.size(); i++) {
            System.out.print(lst.get(i));
        }
    }
}