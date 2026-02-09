import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        double sum = 0;

        for (int i=0; i<arr.length; i++) {
            sum += Double.parseDouble(arr[i]);
        }

        double avg = sum / arr.length;
        
        System.out.printf("%.1f", avg);



    }
}