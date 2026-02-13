import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(cnt(A, B));
    }

    public static int cnt(int a, int b) {
        int cnt = 0;

        for (int i = a; i <= b; i++) {
            if (contains369(i) || i % 3 == 0) {
                cnt++;
            }
        }
        return cnt;
    }

    public static boolean contains369(int num) {
        String s = Integer.toString(num);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '3' || c == '6' || c == '9') {
                return true;
            }
        }
        return false;
    }
}