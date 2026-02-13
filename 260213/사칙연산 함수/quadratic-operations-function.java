import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        // Please write your code here.
        int x = calc(a, o, c);
        if (x == Integer.MIN_VALUE) {
            System.out.println("False");
        } else {
            System.out.printf("%d %c %d = %d", a, o, c, x);
        }
    }

    public static int calc(int a, char o, int c) {
        if (o == '+') {
            return a+c;
        } else if (o== '-') {
            return a-c;
        } else if (o == '/') {
            return a/c;
        } else if (o =='*') {
            return a*c;
        } else
            return Integer.MIN_VALUE;
    }
}