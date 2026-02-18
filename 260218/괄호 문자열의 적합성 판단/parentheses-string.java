import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // Please write your code here.

        Stack<Character> stack = new Stack<>();
        boolean flag = true;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push('(');
            }

            if (str.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    flag = false;
                    break;
                }
                stack.pop();
            }
        }

        if (flag && stack.isEmpty()) {
            System.out.println("Yes");
        } else System.out.println("No");


    }
}