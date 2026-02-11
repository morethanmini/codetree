import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // arr1
        int[][] arr1 = new int[N][M];
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; j++) {
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // arr2
        int[][] arr2 = new int[N][M];
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; j++) {
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // System.out.println(Arrays.deepToString(arr1));
        // System.out.println(Arrays.deepToString(arr2));

        // result
        int[][] result = new int[N][M];
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                if (arr1[i][j] != arr2[i][j]) {
                    result[i][j]++;
                }
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        // System.out.println(Arrays.deepToString(result));

    }
}