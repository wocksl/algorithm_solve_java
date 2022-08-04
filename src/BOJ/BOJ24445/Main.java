package src.BOJ.BOJ24445;

import java.util.*;

public class Main {
    static int cnt;
    public static int[] visited;
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    // DFS 함수 정의
    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        // 현재 노드를 방문 처리
        visited[start] = cnt;
        // 큐가 빌 때까지 반복
        while(!q.isEmpty()) {
            // 큐에서 하나의 원소를 뽑아 출력
            int x = q.poll();
            // 해당 원소와 연결된, 아직 방문하지 않은 원소들을 큐에 삽입
            for(int i = 0; i < graph.get(x).size(); i++) {
                int y = graph.get(x).get(i);
                if(visited[y] == 0) {
                    cnt++;
                    q.offer(y);
                    visited[y] = cnt;
                }
            }
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
            Collections.sort(graph.get(i), Collections.reverseOrder());
        }
        cnt = 1;
        visited = new int[n+1];
        bfs(r);
        for(int i = 1; i < visited.length; i++){
            System.out.println(visited[i]);
        }
    }
}
