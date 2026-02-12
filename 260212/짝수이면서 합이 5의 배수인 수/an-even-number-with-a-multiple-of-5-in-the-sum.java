import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(answer(n));
    }

    public static String answer(int a) {
        String x = a + "";
        int sum = 0;

        for (int i = 0; i < x.length(); i++) {
            sum += x.charAt(i) - '0';
        }

        if (a % 2 == 0 && sum % 5 == 0) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
