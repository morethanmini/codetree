import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        System.out.println(answer(a, b));
    }

    public static String answer(int a, int b) {
        List<Integer> lst = new ArrayList<>();
        lst.add(a);
        lst.add(b);

        Collections.sort(lst);

        int x = lst.get(0) * 2;
        int y = lst.get(1) + 25;

        return x + " " + y;
    }
}