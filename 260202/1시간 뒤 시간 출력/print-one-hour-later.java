import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(":");
        int hour = Integer.parseInt(arr[0]);
        int minute = Integer.parseInt(arr[1]);

        System.out.printf(hour+1 + ":" + minute);

    }
}