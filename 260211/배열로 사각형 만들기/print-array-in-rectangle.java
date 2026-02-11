import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[5][5];

        // 1. 1로 채우기
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                arr[i][j] = 1;
            }
        }

        // 2. 규칙
        for (int i=1; i<5; i++) {
            for (int j=1; j<5; j++) {
                arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }



        // 출력
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}