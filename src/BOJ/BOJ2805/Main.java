package src.BOJ.BOJ2805;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] tree = new int[n];
        int max_height = -1000000001;
        for (int i = 0; i < n; i++){
            tree[i] = sc.nextInt();
            max_height = Math.max(max_height, tree[i]);
        }

        int start = 0;
        int end = max_height;
        int result = 0;
        while(start <= end){
            int mid = (start + end)/2;
            long total = 0;
            for(int i = 0; i < n; i++){
               if (tree[i] >  mid){ total += tree[i] - mid; }
            }
            if (total < m) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
                result = mid;
            }
        }
        System.out.println(result);
    }
}
