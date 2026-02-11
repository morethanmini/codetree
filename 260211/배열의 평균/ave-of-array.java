import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int[][] arr = new int[2][4];

        for (int i=0; i<2; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j=0; j<4; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i=0; i<2; i++) { // 가로 평균
            int sum = 0;
            double avg = 0;

            for (int j=0; j<4; j++) {
                sum += arr[i][j];
            }
            avg = (double) sum / 4;
            System.out.printf("%.1f ", avg);
        }

        System.out.println();

        for (int j=0; j<4; j++) { // 세로 평균
            int sum = 0;
            double avg = 0;

            for (int i=0; i<2; i++) {
                sum += arr[i][j];
            }

            avg = (double) sum / 2;
            System.out.printf("%.1f ", avg);
        }

        System.out.println();

        // 전체 평균
        int sum = 0;
        double avg = 0;

        for (int i=0; i<2; i++) {
            for (int j=0; j<4; j++) {
                sum += arr[i][j];
            }
        }
        avg = (double) sum / 8;
        System.out.printf("%.1f ", avg);

        
    }
}