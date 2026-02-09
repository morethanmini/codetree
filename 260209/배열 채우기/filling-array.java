import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" ");
        List<Integer> lst = new ArrayList<>();

        for (int i=0; i<arr.length; i++) {
            int value = Integer.parseInt(arr[i]);

            if (value == 0)
                break;
            
            lst.add(value);
            
        }

        Collections.reverse(lst);

        // System.out.print(lst);

        for (Integer  l : lst) {
            System.out.print(l + " ");
        }


    }
}