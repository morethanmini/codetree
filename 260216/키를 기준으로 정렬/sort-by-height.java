import java.util.*;
import java.io.*;

class Info {
    String name;
    int height;
    int age;

    public Info(String name, int height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        // Please write your code here.

        Info[] box = new Info[n];

        // 객체 저장
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            int age = Integer.parseInt(st.nextToken());

            box[i] = new Info(name, height, age);
        }

        // System.out.println(box[1].name + " " + box[1].height + " " + box[1].age);

        // 키 기준 -> 오름차순 정렬
        Arrays.sort(box, (a, b) -> a.height - b.height);

        for (int i=0; i<n; i++) {
            System.out.println(box[i].name + " " + box[i].height + " " + box[i].age);
        }




    }
}