import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] result = answer(a, b);

        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] answer(int a, int b) {

        if (a > b) {
            a = a + 25;
            b = b * 2;
        } else {
            a = a * 2;
            b = b + 25;
        }

        return new int[]{a, b};
    }
}