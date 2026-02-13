import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.
        System.out.println(cnt(A, B));
    }

    public static int cnt(int a, int b) {
        int cnt=0;

        for (int i=a; i<=b; i++) {
            String s = i + "";

            if (s.charAt(1) == '3' || s.charAt(1) == '6' || s.charAt(1) == '9' ||
            s.charAt(0) == '3' || s.charAt(0) == '6' || s.charAt(0) == '9') {
                cnt++;
                // System.out.println(s);
            } else if (i%3 == 0) {
                cnt++;
                // System.out.println(i);
            }
        }
        return cnt;
    }
}