import java.util.Scanner;
public class Main {
    public static int R(int[] arr, int n) {
        if (n==1)
            return arr[0];
        
        int max= R(arr, n-1);
        return Math.max(max, arr[n-1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        System.out.print(R(arr, n));
    }
}