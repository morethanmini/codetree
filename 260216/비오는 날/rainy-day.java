import java.util.Scanner;

class Info {
    String date;
    String day;
    String weather;

    public Info(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Info[] box = new Info[n];

        // 객체 담기
        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            // Please write your code here.

            box[i] = new Info(date, day, weather);
        }

        // System.out.print(box[1].date + " " + box[1].day + " " + box[1].weather);

        // 서치
        Info result = null;


        for (int i=0; i<n; i++) {
            // rain 찾기
            if (box[i].weather.equals("Rain")) {
                // 날짜 오름차순 정렬해서 첫번째 꺼내기
                if (result == null || box[i].date.compareTo(result.date) < 0) {
                    result = box[i];
                }
            }
        }
        
        System.out.println(result.date + " " + result.day + " " + result.weather);
    }
}