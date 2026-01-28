import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double n = Double.parseDouble(br.readLine());

        System.out.printf("%.2f%n", Math.round(n * 100) / 100.0);
    }
}
