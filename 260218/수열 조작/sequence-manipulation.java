import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        Deque<Integer> dq = new LinkedList<>();

        for (int i=1; i<=n; i++) {
            dq.addLast(i);
        }

        // 덱 사이즈가 1일때 까지
        while (dq.size() > 1) {
            // 1. 맨 앞 제거 -> pollFirst
            dq.pollFirst();

            // 2. 맨 앞을 맨 뒤에 추가 -> addLast(pollFirst)
            if (dq.size() == 1) {
                break;
            } else dq.addLast(dq.pollFirst());

        }

        System.out.println(dq.peekFirst());
    
    }
}