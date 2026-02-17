import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // Please write your code here.

        char[] c = str.toCharArray();
        int cnt = 0;

        for (int i=0; i<c.length; i++) {
            if (c[i] == '(') {
                for (int j=i; j<c.length; j++) {
                    if (c[j] == ')') {
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}