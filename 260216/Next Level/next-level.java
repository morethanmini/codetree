import java.util.Scanner;

class Box {
    String id = "codetree";
    int level = 10;

    public Box() {
        System.out.println("user " + id + " lv " + level);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();

        Box b = new Box();

        b.id = "hello";
        b.level = 28;

        System.out.println("user " + b.id + " lv " + b.level);
    }
}
