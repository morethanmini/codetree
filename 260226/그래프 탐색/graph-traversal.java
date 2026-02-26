import java.util.*;

public class Main {
    public static int n, m;
    
    // 큰 배열 만들기
    public static final int MAX_NUM = 1000;

    // 어레이 리스트를 담는 graph 배열 선언
    public static ArrayList<Integer>[] graph = new ArrayList[MAX_NUM+1];

    // 방문 초기화
    public static boolean[] visited = new boolean[MAX_NUM+1];
    public static int vertexCnt = 0;

    // DFS(정점)
    public static void DFS(int vertex) {

        // 정점 배열 사이즈만큼
        for (int i=0; i<graph[vertex].size(); i++) {

            // 현재 정점 가져오기
            int currV = graph[vertex].get(i);

            // 현재 노드 방문하지 않으면
            if (!visited[currV]) {

                // 방문처리
                visited[currV] = true;

                // 카운트 변수 세기
                vertexCnt++;

                // 재귀
                DFS(currV);
            }
        }

    }
            

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        // n만큼 graph 만들기
        for (int i=1; i<=n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        // 각 정점에 대한 간선 저장(양방향)
        while (m-- > 0) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

            graph[v1].add(v2);
            graph[v2].add(v1);
        }

        // 시작 노드 방문 처리
        visited[1] = true;

        // 시작 노드 DFS 넣기
        DFS(1);

        System.out.println(vertexCnt);

        
    }
}