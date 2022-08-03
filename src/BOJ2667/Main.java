package src.BOJ2667;

import java.util.*;

public class Main {
    public static int[][] graph = new int[25][25];
    public static boolean[][] visited = new boolean[25][25];
    //이동 할 수 있는 방향 정의 (상, 하, 좌, 우)
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};
    public static int n;
    public static int[] aparts = new int[25*25];
    public static int apartCnt = 0;
    public static void dfs(int x, int y) {
        visited[x][y] = true;
        aparts[apartCnt]++;
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >=0 && ny >=0 && nx < n && ny < n){
                if(graph[nx][ny] == 1 && !visited[nx][ny]){
                    dfs(nx,ny);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //지도의 크기
        graph = new int[n][n];
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < n; j++) {
                graph[i][j] = s.charAt(j) - '0';
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(graph[i][j] == 1 && !visited[i][j]){
                    apartCnt++;
                    dfs(i,j);
                }
            }
        }
        Arrays.sort(aparts);
        System.out.println(apartCnt);

        for(int i=0; i<aparts.length; i++){
            if(aparts[i] == 0){
            }
            else{
                System.out.println(aparts[i]);
            }
        }
    }
}
