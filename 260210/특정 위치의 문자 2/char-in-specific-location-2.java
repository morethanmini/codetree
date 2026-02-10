import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String[] str = new String[10];

        for (int i=0; i<10; i++) {
            String value = st.nextToken();

            str[i] = value;
        }

        System.out.print(str[1] + " " + str[4] + " " + str[7]);
    }
}