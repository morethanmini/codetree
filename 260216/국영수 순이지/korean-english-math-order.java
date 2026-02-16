import java.util.*;

class Info implements Comparable<Info>{
    String name;
    int korean;
    int english;
    int math;

    public Info(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    @Override
    public int compareTo(Info info) {
        if (this.korean == info.korean) {
            if (this.english == info.english) {
                return info.math- this.math;
            }
            return info.english - this.english;
        }
        return info.korean - this.korean;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Info[] box = new Info[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int korean = sc.nextInt();
            int english = sc.nextInt();
            int math = sc.nextInt();

            box[i] = new Info(name, korean, english, math);
        }

        Arrays.sort(box);

        for (int i = 0; i < n; i++) {
            System.out.println(box[i].name + " " + box[i].korean + " " + box[i].english + " " + box[i].math);
        }
    }
}
