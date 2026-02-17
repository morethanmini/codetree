import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine().trim());
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            String[] cmd = line.split(" ");

            switch (cmd[0]) {
                case "push_back":
                    arr.add(Integer.parseInt(cmd[1]));
                    break;

                case "pop_back":
                    if (!arr.isEmpty()) {
                        arr.remove(arr.size() - 1);
                    }
                    break;

                case "size":
                    sb.append(arr.size()).append('\n');
                    break;

                case "get":
                    int k = Integer.parseInt(cmd[1]);
                    // 문제 예시 기준: k는 1부터 시작
                    sb.append(arr.get(k - 1)).append('\n');
                    break;
            }
        }

        System.out.print(sb.toString());
    }
}
