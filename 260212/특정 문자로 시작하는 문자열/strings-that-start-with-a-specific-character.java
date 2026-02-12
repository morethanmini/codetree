import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<String> lst = new ArrayList<>();

        for (int i=0; i<4; i++) {
            lst.add(br.readLine());
        }

        char c = br.readLine().charAt(0);
        int cnt = 0;
        int sum = 0;
        double avg = 0;

        for (int i=0; i<4; i++) {
            if (lst.get(i).charAt(0) == c) {
                cnt++;
                sum += lst.get(i).length();
            }
        }


        avg = (double) sum / cnt;

        System.out.printf("%d %.2f", cnt, avg);

    }
}