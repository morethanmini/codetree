import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();

        // 1단계: A진수 → 10진수 변환
        char[] arr = N.toCharArray();
        int decimal = 0;

        for (int i = 0; i < arr.length; i++) {
            decimal = decimal * A + (arr[i] - '0');
        }

        // 2단계: 10진수 → B진수 변환
        if (decimal == 0) {
            System.out.print(0);
            return;
        }

        List<Integer> lst = new ArrayList<>();

        while (decimal > 0) {
            lst.add(decimal % B);
            decimal /= B;
        }

        // 역순 출력
        for (int i = lst.size() - 1; i >= 0; i--) {
            System.out.print(lst.get(i));
        }
    }
}
