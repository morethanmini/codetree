import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int[] result = answer(n, arr);

        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] answer(int n, int[] arr) {
        for(int i=0; i<n; i++) {
            if(arr[i]%2==0) {
                arr[i] = arr[i] / 2;
            }
        }

        return arr;
    }
}