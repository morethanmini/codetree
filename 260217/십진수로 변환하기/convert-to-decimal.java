import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.

        char[] arr = binary.toCharArray();
        // for (char c : arr) {
        //     System.out.print(c + " ");
        // }

        int n = 0;

        for (int i=0; i<arr.length; i++) {
            n = n * 2 + (arr[i] - '0');
        }

        System.out.print(n);
    }
}

