import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double a = Double.parseDouble(br.readLine());

        double b = Double.parseDouble(br.readLine());

        double c = Double.parseDouble(br.readLine());

        System.out.printf("%.3f%n", Math.round(a * 1000) / 1000.0);
        System.out.printf("%.3f%n", Math.round(b * 1000) / 1000.0);
        System.out.printf("%.3f%n", Math.round(c * 1000) / 1000.0);


    }
}