import java.util.*;

public class Main {
    public static void sort(Integer[] arr) {

        Integer[] asc = arr.clone();
        Integer[] des = arr.clone();

        Arrays.sort(asc);
        Arrays.sort(des, Collections.reverseOrder());

        for (int x : asc) {
            System.out.print(x + " ");
        }
        System.out.println();

        for (int x : des) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        sort(arr);
    }
}