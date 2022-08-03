package src.BOJ24479;

import java.util.*;

public class Main {
    static int cnt;
    public static int[] visited;
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    // DFS 함수 정의
    public static void dfs(int x) {
        // 현재 노드를 방문 처리
        visited[x] = cnt;
        // 현재 노드와 연결된 다른 노드를 재귀적으로 방문
        for (int i = 0; i < graph.get(x).size(); i++) {
            int y = graph.get(x).get(i);
            if (visited[y] == 0) {
                cnt++;
                dfs(y);}
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //정점의 수
        int m = sc.nextInt(); //간선의 수
        int r = sc.nextInt(); //시작 정점

        // 그래프 초기화
        for(int i = 0; i < n+1; i++){
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        for(int i = 0; i < graph.size(); i++){
            Collections.sort(graph.get(i));
        }
        cnt = 1;
        visited = new int[n+1];
        dfs(r);
        for(int i = 1; i < visited.length; i++){
            System.out.println(visited[i]);
        }
    }
}
