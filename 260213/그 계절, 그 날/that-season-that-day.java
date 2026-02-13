import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        System.out.println(answer(y, m, d));
    }

    public static String answer(int y, int m, int d) {

        // 월 범위 검사
        if (m < 1 || m > 12) return "-1";

        // 각 월의 최대 일수 계산
        int maxDay = getMaxDay(y, m);

        // 날짜 범위 검사
        if (d < 1 || d > maxDay) return "-1";

        // 계절 판별
        if (m >= 3 && m <= 5) {
            return "Spring";
        } else if (m >= 6 && m <= 8) {
            return "Summer";
        } else if (m >= 9 && m <= 11) {
            return "Fall";
        } else {
            return "Winter";
        }
    }

    public static int getMaxDay(int y, int m) {
        // 31일까지 있는 달
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            return 31;
        }
        // 30일까지 있는 달
        else if (m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        }
        // 2월
        else {
            return yun(y) ? 29 : 28;
        }
    }

    public static boolean yun(int y) {
        if (y % 400 == 0) return true;
        if (y % 100 == 0) return false;
        if (y % 4 == 0) return true;
        return false;
    }
}