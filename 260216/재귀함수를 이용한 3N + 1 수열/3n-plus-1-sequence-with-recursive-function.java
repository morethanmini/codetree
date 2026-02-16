import java.util.Scanner;
public class Main {
    public static int cnt=0;

    public static int R(int n) {
        if (n==1) return cnt;
        
        cnt++;

        if (n%2==0) {
            return R(n/2);
        }
            
        else {
            return R(n*3+1);
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.print(R(n));
    }
}