import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(sum(n));
    }

    public static int sum(int a) {
        int sum = 0;

        for (int i=1; i<=a; i++) {
            sum += i;
        }

        return sum/10;
    }
}