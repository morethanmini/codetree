import java.util.*;

class Info {
    int height;
    int weight;
    int number;

    public Info(int height, int weight, int number) {
        this.height = height;
        this.weight = weight;
        this.number = number;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Info[] box = new Info[n];

        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            box[i] = new Info(height, weight, i + 1); // 번호는 입력 순서
        }

        Arrays.sort(box, (a, b) -> {
            if (a.height == b.height) {
                if (a.weight == b.weight) {
                    return a.number - b.number; // 번호 오름차순
                }
                return b.weight - a.weight; // 몸무게 내림차순
            }
            return a.height - b.height;
        });

        for (int i = 0; i < n; i++) {
            System.out.println(box[i].height + " " + box[i].weight + " " + box[i].number);
        }
    }
}
