import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        int maxStar = 2 * a - 1;

        // 위쪽 (감소)
        for (int i = 0; i < a; i++) {
            // 공백
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            // 별
            for (int j = 0; j < maxStar - 2 * i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 아래쪽 (증가)
        for (int i = a - 2; i >= 0; i--) {
            // 공백
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            // 별
            for (int j = 0; j < maxStar - 2 * i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
