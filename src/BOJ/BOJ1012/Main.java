package src.BOJ.BOJ1012;

import java.util.*;

public class Main {
    //배추밭의 가로(m) 세로(n)길이
    public static int m, n;
    //배추밭
    public static int[][] graph = new int[50][50];
    //배추가 심어진 여부
    public static boolean[][] visited = new boolean[50][50];
    //이동 할 수 있는 방향 정의 (상, 하, 좌, 우)
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};
    public static void dfs(int x, int y) {
        visited[x][y] = true;

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >=0 && ny >=0 && nx < m && ny < n){
                if(graph[nx][ny] == 1 && !visited[nx][ny]){
                    dfs(nx,ny);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); //테스트 케이스 개수


        int test = 0;
        while(test<t) {
            m = sc.nextInt(); //가로
            n = sc.nextInt(); //세로
            int k = sc.nextInt(); //배추개수

            graph = new int[m][n];
            visited = new boolean[m][n];
            for (int i = 0; i < k; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                graph[x][y] = 1;
            }
            int cnt = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (graph[i][j] == 1 && !visited[i][j]) {
                        cnt++;
                        dfs(i, j);
                    }
                }
            }
            System.out.println(cnt);
            test++;
        }
    }
}
