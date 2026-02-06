import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        int num = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(num + " ");
                num++;
                if (num == 10) { // 9 다음에 다시 1로
                    num = 1;
                }
            }
            System.out.println();
        }

        sc.close();


    }

}