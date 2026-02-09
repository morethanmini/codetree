import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        int sum = 0;
        double avg = 0;
        int count = 0;

        for (int i=0; i<arr.length; i++) {
            int value = Integer.parseInt(arr[i]);

            if (value == 0)
                break;
            
            sum += value;
            count++;
        }

        avg = sum/count;

        System.out.printf("%d %.1f", sum, avg);

    }
}