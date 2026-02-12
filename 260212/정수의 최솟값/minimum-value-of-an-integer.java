import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.

        System.out.print(min(a, b, c));
    }


    public static int min(int a, int b, int c) {


        List<Integer> lst = new ArrayList<>();
        lst.add(a);
        lst.add(b);
        lst.add(c);

        Collections.sort(lst);


        return lst.get(0);
    }
}