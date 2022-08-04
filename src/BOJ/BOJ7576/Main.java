package src.BOJ.BOJ7576;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int m, n;
    public static int graph[][] = new int[1000][1000];
    public static int visited[][] = new int[1000][1000];
    //이동 할 수 있는 방향 정의 (상, 하, 좌, 우)
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};
    public static int bfs(int x, int y, Queue<int[]> q, int[][] box, int[][] visit, int cnt) {
        int day = 1;
        // 큐가 빌 때까지 반복하기
        while (!q.isEmpty()) {
            int now[] = q.poll();
            int nowx = now[0];
            int nowy = now[1];
            // 현재 위치에서 4가지 방향으로의 위치 확인
            for (int i = 0; i < 4; i++) {
                int nextx = nowx + dx[i];
                int nexty = nowy + dy[i];
                // 상자를 벗어난 경우 무시
                if (nextx < 0 || nextx >= n || nexty < 0 || nexty >= m) continue;
                // 토마토가 비어있는 경우 무시
                if (box[nextx][nexty] == -1) continue;
                // 해당 노드를 처음 방문하는 경우에만 최단 거리 기록
                if(box[nextx][nexty] == 0 && visit[nextx][nexty] == 0) {
                    q.add(new int[]{nextx, nexty});
                    box[nextx][nexty] = 1;
                    visit[nextx][nexty] = visit[nowx][nowy] + 1;
                    day = Math.max(day, visit[nextx][nexty]);
                    cnt--;
                }
            }
        }
        if(cnt == 0) return day - 1;
        else return -1;
    }

    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        graph = new int[n][m];
        visited = new int[n][m];
        int raretomato = 0;
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                int a = Integer.parseInt(st.nextToken());
                if(a == -1){
                    graph[i][j] = -1;
                }
                else if (a == 0){
                    graph[i][j] = 0;
                    raretomato++;
                }
                else if (a == 1){
                    graph[i][j] = 1;
                    q.add(new int[] {i, j});
                    visited[i][j] = 1;
                }
            }
        }
        System.out.println(bfs(n, m, q, graph, visited, raretomato));
    }
}
