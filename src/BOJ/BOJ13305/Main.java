package src.BOJ.BOJ13305;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] distance = new long[n-1];
        for(int i = 0; i < n-1; i++){ distance[i] = sc.nextInt(); }

        long[] cost = new long[n];
        for(int i = 0; i < n; i++){ cost[i] = sc.nextInt(); }

        long min_cost = cost[0];
        long result = 0;
        for(int i = 0; i < n-1; i++){
            if (cost[i] < min_cost) {
                min_cost = cost[i];
            }
            result += distance[i] * min_cost;
        }
        System.out.println(result);
    }
}
