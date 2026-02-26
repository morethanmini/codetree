import java.io.*;
import java.util.*;

public class Main {
	public static int n, m;
	
	public static final int MAX_NUM = 1000;
	public static ArrayList<Integer>[] graph = new ArrayList[MAX_NUM+1];
	public static boolean[] visited = new boolean[MAX_NUM+1];
	public static int vertexCnt = 0;
	
	public static void DFS(int vertex) {
		for (int i=0; i<graph[vertex].size(); i++) {
			int currV = graph[vertex].get(i);
			
			if (!visited[currV]) {
				visited[currV] = true;
				vertexCnt++;
				DFS(currV);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		for (int i=1; i<=n; i++) {
			graph[i] = new ArrayList<>();
		}
		
		while (m-- >0) {
			st = new StringTokenizer(br.readLine());
			int v1 = Integer.parseInt(st.nextToken());
			int v2 = Integer.parseInt(st.nextToken());
			
			graph[v1].add(v2);
			graph[v2].add(v1);
		}
		
		visited[1] = true;
		DFS(1);
		
		System.out.println(vertexCnt);

	}

}
