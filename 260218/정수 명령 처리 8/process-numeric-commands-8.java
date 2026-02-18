import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedList<Integer> lst = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String command = sc.next();
            // Please write your code here.

            switch (command) {
                case "push_front" : 
                    int num = sc.nextInt();
                    lst.addFirst(num);
                    break;
                
                case "push_back" : 
                    lst.addLast(sc.nextInt());
                    break;

                case "pop_front" : 
                    System.out.println(lst.pollFirst());
                    break;

                case "pop_back" : 
                    System.out.println(lst.pollLast());
                    break;
                
                case "size" : 
                    System.out.println(lst.size());
                    break;

                case "empty" :
                    if (lst.isEmpty()) {
                        System.out.println(1);
                    } else System.out.println(0);
                    break;
                
                case "front" :
                    System.out.println(lst.peekFirst());
                    break;

                case "back" :
                    System.out.println(lst.peekLast());
                    break;
            }
        }
    }
}