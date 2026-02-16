import java.util.*;

class Info {
    String name;
    int score1;
    int score2;
    int score3;

    public Info(String name, int score1, int score2, int score3) {
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Info[] box = new Info[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();
            int score3 = sc.nextInt();

            box[i] = new Info(name, score1, score2, score3);
        }

        // 총점 기준 오름차순 정렬
        Arrays.sort(box, (a, b) ->
            Integer.compare(
                a.score1 + a.score2 + a.score3,
                b.score1 + b.score2 + b.score3
            )
        );

        for (int i = 0; i < n; i++) {
            System.out.println(box[i].name + " " + box[i].score1 + " " + box[i].score2 + " " + box[i].score3);
        }
    }
}
