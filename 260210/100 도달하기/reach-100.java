import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> result = new ArrayList<>();

        result.add(1);
        result.add(N);

        while (true) {
            int size = result.size();
            int next = result.get(size - 1) + result.get(size - 2);
            result.add(next);
            
            if (next > 100) break;

            
        }

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
