import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[][] arr1 = new int[3][3];
        int num1 = 1;

        // arr1 채우기
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr1[i][j] = num1++;
            }
        }

        int[][] arr2 = new int[3][3];
        int num2 = 2;

        // arr2 채우기
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = num2++;
            }
        }

        int[][] arr3 = new int[3][3];

        // 원소별 곱(element-wise multiplication)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr3[i][j] = arr1[i][j] * arr2[i][j];
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
