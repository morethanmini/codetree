import java.util.Scanner;
public class Main {
    public static void recursive(int n) {
        if (n==0) {
            return;
        }

        for (int i=0; i<n; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        recursive(n-1);
        for (int j=0; j<n; j++) {
            System.out.print("*" + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        recursive(n);
    }
}