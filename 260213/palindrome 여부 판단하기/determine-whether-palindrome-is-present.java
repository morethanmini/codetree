import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // Please write your code here.
        System.out.println(answer(input));
    }

    public static String answer(String s) {

        String reversed = new StringBuilder(s).reverse().toString();

        if (s.equals(reversed)) {
            return "Yes";
        }
        return "No";
    }
}