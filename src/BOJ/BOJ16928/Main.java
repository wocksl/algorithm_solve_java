package src.BOJ.BOJ16928;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static int dx[] = {1, 2, 3, 4, 5, 6};
    public static boolean[] visited = new boolean[101];
    public static int[] graph= new int[101];
    public static int[] moveaction = new int[101];
    public static void bfs(int x) {
        Queue<Integer> q = new LinkedList<>();
        q.add(x);
        graph[x] = 0;
        visited[x] = true;
        // 큐가 빌 때까지 반복하기
        while (!q.isEmpty()) {
            int nowx = q.poll();
            if(nowx == 100) {
                System.out.println(graph[nowx]);
                return;
            }
            for (int i = 0; i < 6; i++) {
                int nextx = nowx + dx[i];
                
                if(nextx > 100) continue;
                if(visited[nextx]) continue;
                
                visited[nextx] = true;
                if(moveaction[nextx] != 0) {
                    if(!visited[moveaction[nextx]]){
                        q.add(moveaction[nextx]);
                        visited[moveaction[nextx]] = true;
                        graph[moveaction[nextx]] = graph[nowx] + 1;
                    }
                }
                else {
                    q.add(nextx);
                    graph[nextx] = graph[nowx] + 1;
                }
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n+m; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            moveaction[x] = y;
        }
        
        bfs(1);
   }
}
