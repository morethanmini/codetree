import java.util.*;
import java.io.*;

class Solution {
    String s;
    char c;
    int t;

    public Solution(String s, char c, int t) {
        this.s = s;
        this.c = c;
        this.t = t;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String sCode = st.nextToken();
        char mPoint = st.nextToken().charAt(0);
        int time = Integer.parseInt(st.nextToken());
        // Please write your code here.

        Solution sol = new Solution(sCode, mPoint, time);

        System.out.println("secret code : " + sol.s);
        System.out.println("meeting point : " + sol.c);
        System.out.println("time : " + sol.t);
    }
}