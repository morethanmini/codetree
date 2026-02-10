import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int result = 0;

        while (true) {
    
            result += n;
            System.out.print(result + " ");

            if (result % 5 == 0) {
                cnt++;
            }
                

            if (cnt == 2) {
                break;
            }
                
        }

    }
}