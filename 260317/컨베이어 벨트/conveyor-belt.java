import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] top = new int[n];
        int[] bottom = new int[n];
        for (int i = 0; i < n; i++) {
            top[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            bottom[i] = sc.nextInt();
        }
        // Please write your code here.

        for (int T=0; T<t; T++) {
            int temp1 = bottom[n-1];
            int temp2 = top[n-1];
            
            for(int i=n-1; i>=1; i--) {
                top[i] = top[i-1];
                bottom[i] = bottom[i-1];
            }

            top[0] = temp1;
            bottom[0] = temp2;
        }

        for(int r : top) {
            System.out.print(r + " ");
        }

        System.out.println();

        for(int r : bottom) {
            System.out.print(r + " ");
        }
    }
}