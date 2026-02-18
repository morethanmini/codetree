import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // Please write your code here.

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            }

            if (str.charAt(i) == ')') {
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Yes");
        } else System.out.println("No");


    }
}