import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i=1; i<=4; i++) {
            for (int j=1; j<=4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}