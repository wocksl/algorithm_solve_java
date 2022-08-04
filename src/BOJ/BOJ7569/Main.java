package src.BOJ.BOJ7569;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int m, n, h;
    public static int graph[][][];
    public static int visited[][][];
    //이동 할 수 있는 방향 정의 (상, 하, 좌, 우, 위, 아래)
    public static int dx[] = {-1, 1, 0, 0, 0, 0};
    public static int dy[] = {0, 0, -1, 1, 0, 0};
    public static int dz[] = {0, 0, 0, 0, -1, 1};
    public static int bfs(int x, int y, int z, Queue<int[]> q, int[][][] box, int[][][] visit, int cnt) {
        int day = 1;
        // 큐가 빌 때까지 반복하기
        while (!q.isEmpty()) {
            int now[] = q.poll();
            int nowx = now[0];
            int nowy = now[1];
            int nowz = now[2];
            // 현재 위치에서 4가지 방향으로의 위치 확인
            for (int i = 0; i < 6; i++) {
                int nextx = nowx + dx[i];
                int nexty = nowy + dy[i];
                int nextz = nowz + dz[i];
                // 상자를 벗어난 경우 무시
                if (nextx < 0 || nextx >= n || nexty < 0 || nexty >= m || nextz < 0 || nextz >= h) continue;
                // 토마토가 비어있는 경우 무시
                if (box[nextz][nextx][nexty] == -1) continue;
                // 해당 노드를 처음 방문하는 경우에만 최단 거리 기록
                if(box[nextz][nextx][nexty] == 0 && visit[nextz][nextx][nexty] == 0) {
                    q.add(new int[]{nextx, nexty, nextz});
                    box[nextz][nextx][nexty] = 1;
                    visit[nextz][nextx][nexty] = visit[nowz][nowx][nowy] + 1;
                    day = Math.max(day, visit[nextz][nextx][nexty]);
                    cnt--;
                }
            }
        }
        if(cnt == 0) return day - 1;
        else return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        graph = new int[h][n][m];
        visited = new int[h][n][m];

        int raretomato = 0;
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < m; k++) {
                    int a = Integer.parseInt(st.nextToken());
                    if (a == -1) {
                        graph[i][j][k] = -1;
                    } else if (a == 0) {
                        graph[i][j][k] = 0;
                        raretomato++;
                    } else if (a == 1) {
                        graph[i][j][k] = 1;
                        q.add(new int[]{j, k, i});
                        visited[i][j][k] = 1;
                    }
                }
            }
        }
        System.out.println(bfs(n, m, h, q, graph, visited, raretomato));
    }
}
