import java.util.Scanner;
public class Main {
    public static int[] arr;
    public static int a1, a2;

    public static int solution(int[] arr, int a1, int a2) {
        int sum = 0;

        for (int i=a1-1; i<a2; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            a1 = sc.nextInt();
            a2 = sc.nextInt();
            // Please write your code here.
            System.out.println(solution(arr, a1, a2));
        }
    }
}