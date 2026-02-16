import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        int[] result = solution(a, b);
        
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] solution(int a, int b) {
        if (a > b) {
            a = a * 2;
            b = b + 10;
        } else { 
            a = a + 10;
            b = b * 2;
        }

        return new int[]{a, b};
    }
}