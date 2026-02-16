import java.util.*;
import java.io.*;

class Box {
    char name;
    int score;

    public Box(char name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Box[] b = new Box[5]; 

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());      
            
            char name = st.nextToken().charAt(0);
            int score = Integer.parseInt(st.nextToken());
            b[i] = new Box(name, score);
        }

        // System.out.println(b[2].name + " " + b[2].score);

        int min = Integer.MAX_VALUE;
        int idx = 0;

        for (int i=0; i<5; i++) {
            if (min > b[i].score) {
                min = b[i].score;
                idx = i;
            }
        }

        System.out.println(b[idx].name + " " + b[idx].score);
    }
}
