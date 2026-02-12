import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        List<String> lst = new ArrayList<>();

        while (st.hasMoreTokens()) {
            lst.add(st.nextToken());
        }

        

        for (int i=lst.size()-1; i>=0; i --) {
            System.out.println(lst.get(i));
        }


    }
}