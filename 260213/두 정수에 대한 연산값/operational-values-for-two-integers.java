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

        int small = Math.min(a, b);
        int large = Math.max(a, b);

        small = small * 2;
        large = large + 25;

        return new int[]{small, large};
    }
}