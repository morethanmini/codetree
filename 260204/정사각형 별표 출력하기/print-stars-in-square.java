import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}