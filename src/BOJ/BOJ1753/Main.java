package src.BOJ.BOJ1753;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Node{
    private int index;
    private int distance;
    public Node(int index, int distance){
        this.index = index;
        this.distance = distance;
    }
    public int getIndex() {
        return this.index;
    }

    public int getDistance() {
        return this.distance;
    }
}
public class Main {
    public static final int INF = (int)1e9;
    public static int V, E, K;
    //노드정보 테이블
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
    public static boolean[] visited = new boolean[100001];  //방문체크 테이블
    public static int[] d = new int[100001];    //최단거리 테이블
    public static int getSmallestNode(){
        int minValue = INF;
        int index = 0;  //가장 최단 거리가 짧은 노드
        for(int i = 1; i <= V; i++){
            //최단거리 테이블의 값이 현재 최소값보다 작으며 방문한적이 없다면
            if (d[i] < minValue && !visited[i]){
                minValue = d[i];
                index = i;
            }
        }
        return index;
    }
    public static void daijkstra(int start){
        d[start] = 0;
        visited[start] = true;
        for(int i = 0; i < graph.get(start).size(); i++){
            d[graph.get(start).get(i).getIndex()] = graph.get(start).get(i).getDistance();
        }
        for(int i = 0; i < V - 1; i++){
            int now = getSmallestNode();
            visited[now] = true;
            for(int j = 0; j < graph.get(now).size(); j++){
                int cost = d[now] + graph.get(now).get(j).getDistance();
                if(cost < d[graph.get(now).get(j).getIndex()]){
                    d[graph.get(now).get(j).getIndex()] = cost;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());   //정점의 개수
        E = Integer.parseInt(st.nextToken());   //간선의 개수
        
        st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());   //정점의 번호

        for (int i = 0; i <= V; i++) {  //그래프 초기화
            graph.add(new ArrayList<Node>());
        }
        for(int i = 0; i < E; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph.get(u).add(new Node(v, w));
        }
        Arrays.fill(d, INF);    //최단거리 테이블을 무한값으로 초기화
        daijkstra(K);
        for(int i = 1; i <= V; i++){
            if(d[i] == INF){
                System.out.println("INF");
            }else{
                System.out.println(d[i]);
            }
        }
    }
}
