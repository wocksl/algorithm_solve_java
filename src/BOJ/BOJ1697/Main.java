package src.BOJ.BOJ1697;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static int n, k;
    public static int[] graph;

    public static void bfs(int x) {
        Queue<Integer> q = new LinkedList<>();
        q.add(x);
        graph[x] = 1;
        // 큐가 빌 때까지 반복하기
        while (!q.isEmpty()) {
            int nowx = q.poll();
            // 현재 위치에서 3가지 방향으로의 위치 확인
            for (int i = 0; i < 3; i++) {
                int nextx = 0;

                if(i == 0) nextx = nowx + 1;
                else if(i == 1) nextx = nowx - 1;
                else nextx = nowx * 2;

                if(nextx == k){
                    System.out.println(graph[nowx]);
                    return;
                }
                if(nextx >= 0 && nextx < 100001 && graph[nextx] == 0){
                    q.add(nextx);
                    graph[nextx] = graph[nowx] + 1;
                }
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); //수빈
        k = Integer.parseInt(st.nextToken()); //동생

        graph = new int[100001];

        if(n == k) System.out.println(0);
        else bfs(n);
   }
}
