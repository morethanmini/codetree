import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();
        // Please write your code here.

        char[] arr = N.toCharArray();
        int n = 0;

        for (int i=0; i<arr.length; i++) {
            n = n * A + (arr[i] - '0');
        }

        List<Integer> lst = new ArrayList<>();
        while (true) {
            if (n<2) {
                lst.add(n);
                break;
            }

            lst.add(n%B);
            n /= B;
        }

        for (int i=lst.size()-1; i>=0; i--) {
            System.out.print(lst.get(i));
        }
    }
}