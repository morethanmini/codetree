import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());


        List<Integer> lst = new ArrayList<>();

        lst.add(a);
        lst.add(b);

        // System.out.print(lst);
        int i = 2;

        // int temp = lst.get(i-1) + 2 * lst.get(i-2);
        // System.out.println(temp);

        while (true) {
            if (i == 10)
                break;

            lst.add(lst.get(i-1) + 2 * lst.get(i-2));
            i++;
        }

        // System.out.println(lst);
        for (Integer l : lst) {
            System.out.print(l + " ");
        }


    }
}