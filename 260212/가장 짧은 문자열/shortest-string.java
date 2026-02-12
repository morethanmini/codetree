import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // String s1 = br.readLine();
        // String s2 = br.readLine();
        // String s3 = br.readLine();

        List<Integer> lst = new ArrayList<>();

        for (int i=0; i<3; i++) {
            int value = br.readLine().length();
            lst.add(value);
        }   


        Collections.sort(lst);
        int max = lst.get(lst.size()-1);
        int min = lst.get(0);
        System.out.println(max-min);


    }
}