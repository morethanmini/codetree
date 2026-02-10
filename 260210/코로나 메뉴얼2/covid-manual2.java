import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] cntArr = new int[4];

        for (int i=0; i<3; i++) {
            st = new StringTokenizer(br.readLine());

            String flag = st.nextToken();
            int tem = Integer.parseInt(st.nextToken());

            if (flag.equals("Y") && tem >= 37) {
                cntArr[0]++;
            }
            else if (flag.equals("N") && tem >= 37) {
                cntArr[1]++;
            }
            else if (flag.equals("Y") && tem < 37) {
                cntArr[2]++;
            }
            else {
                cntArr[3]++;
            }

            // System.out.println(Arrays.toString(cntArr));

        }

        for (int j = 0; j < cntArr.length; j++) {
            System.out.print(cntArr[j] + " ");
        }

        if (cntArr[0] >= 2) {
                System.out.print("E ");
        }

    }
}