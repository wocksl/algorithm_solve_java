package src.BOJ1260;

import java.util.*;

public class Main {
    static int cnt1, cnt2;
    public static boolean[] visited1;
    public static boolean[] visited2;
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    // DFS 함수 정의
    public static void dfs(int x) {
        // 현재 노드를 방문 처리
        visited1[x] = true;
        System.out.print(x + " ");
        // 현재 노드와 연결된 다른 노드를 재귀적으로 방문
        for (int i = 0; i < graph.get(x).size(); i++) {
            int y = graph.get(x).get(i);
            if (!visited1[y]) {
                dfs(y);}
        }
    }
    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        // 현재 노드를 방문 처리
        visited2[start] = true;
        // 큐가 빌 때까지 반복
        while(!q.isEmpty()) {
            // 큐에서 하나의 원소를 뽑아 출력
            int x = q.poll();
            System.out.print(x + " ");
            // 해당 원소와 연결된, 아직 방문하지 않은 원소들을 큐에 삽입
            for(int i = 0; i < graph.get(x).size(); i++) {
                int y = graph.get(x).get(i);
                if(!visited2[y]) {
                    q.offer(y);
                    visited2[y] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //정점의 수
        int m = sc.nextInt(); //간선의 수
        int start = sc.nextInt(); //시작 정점
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
        cnt1 = 1;
        cnt2 = 1;
        visited1 = new boolean[n+1];
        visited2 = new boolean[n+1];
        dfs(start);
        System.out.println();
        bfs(start);
    }
}
