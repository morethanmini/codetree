import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        List<Integer> lst = new ArrayList<>();

        while (true) {
            if (n<2) {
                lst.add(n);
                break;
            }
                
            
            lst.add(n%2);
            n /= 2;
        }

        for (int i=lst.size()-1; i>=0; i--) {
            System.out.print(lst.get(i));
        }
    }
}