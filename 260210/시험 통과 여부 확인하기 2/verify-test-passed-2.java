import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int T = Integer.parseInt(br.readLine());
    int result = 0;

    for (int i = 0; i < T; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;

        
        for (int j = 0; j < 4; j++) {
            sum += Integer.parseInt(st.nextToken());  
        }

        double avg = (double) sum / 4;

        if (avg >= 60) {
            System.out.println("pass");
            result++;
                
        }

        else {
            System.out.println("fail");
        }
    }
    
    System.out.println(result);

    }
}