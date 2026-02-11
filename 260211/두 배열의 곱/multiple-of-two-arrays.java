import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] arr1 = new int[3][3];
        int num1 = 1;

        for (int i=0; i<3; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j=0; j<3; j++) {
                arr1[i][j] = num1;
                num1 += 1;
            }
        }

        int[][] arr2 = new int[3][3];
        int num2 = 2;

        for (int i=0; i<3; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j=0; j<3; j++) {
                arr2[i][j] = num2;
                num2 += 1;
            }
        }

        // System.out.println(Arrays.deepToString(arr1));
        // System.out.println(Arrays.deepToString(arr2));

        int[][] arr3 = new int[3][3];

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                arr3[i][j] = arr1[i][j] * arr2[i][j];

                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

        // System.out.println(Arrays.deepToString(arr3));


    }
}