package src.BOJ.BOJ2178;

import java.util.*;

public class Main {
    public static int n, m;
    public static int cnt = 0;
    public static int[][] graph = new int[100][100];
    public static boolean[][] visited = new boolean[100][100];
    //이동 할 수 있는 방향 정의 (상, 하, 좌, 우)
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};
    public static void bfs(int x, int y) {
        // 큐(Queue) 구현을 위해 queue 라이브러리 사용
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x, y});
        // 큐가 빌 때까지 반복하기
        while (!q.isEmpty()) {
            int now[] = q.poll();
            int nowx = now[0];
            int nowy = now[1];
            // 현재 위치에서 4가지 방향으로의 위치 확인
            for (int i = 0; i < 4; i++) {
                int nextx = nowx + dx[i];
                int nexty = nowy + dy[i];
                // 미로 찾기 공간을 벗어난 경우 무시
                if (nextx < 0 || nextx >= n || nexty < 0 || nexty >= m) continue;
                // 벽인 경우 무시
                if (graph[nextx][nexty] == 0 || visited[nextx][nexty]) continue;
                // 해당 노드를 처음 방문하는 경우에만 최단 거리 기록
                if(graph[nextx][nexty] == 1 && !visited[nextx][nexty]) {
                    q.add(new int[]{nextx, nexty});
                    graph[nextx][nexty] = graph[nowx][nowy] + 1;
                    visited[nextx][nexty] = true;
                }

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n][m];
        visited = new boolean[n][m];
        for(int i = 0; i < n; i++){
            String s = sc.next();
            for(int j = 0; j < m; j++){
                graph[i][j] = s.charAt(j) - '0';
            }
        }
        visited[0][0] = true;
        bfs(0, 0);
        System.out.println(graph[n-1][m-1]);
    }
}
