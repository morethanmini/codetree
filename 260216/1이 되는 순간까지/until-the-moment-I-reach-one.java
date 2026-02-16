import java.util.Scanner;
public class Main {
    public static int cnt=0;

    public static void R(int n) {
        if (n == 1)
            return;

        cnt++;

        if (n % 2 == 0) {
            R(n / 2);
        } else {
            R(n / 3);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        R(n);
        System.out.print(cnt);
    }
}