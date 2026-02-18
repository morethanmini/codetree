import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        // Please write your code here.

        Queue<Integer> q = new LinkedList<>();

        for (int i=1; i<=n; i++) {
            q.add(i);
        }

        while (!q.isEmpty()) {
            for (int i=0; i<k-1; i++) {
                q.add(q.poll());
            }
            
            if (!q.isEmpty()) {
                System.out.print(q.poll() + " ");
            }
        }
    }
}