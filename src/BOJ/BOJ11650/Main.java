package src.BOJ.BOJ11650;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] xy = new int[n][2];
        for(int i = 0; i < n; i++){
            xy[i][0] = sc.nextInt();
            xy[i][1] = sc.nextInt();
        }
        //람다식을 이용한 구현 (템플릿처럼 기억할것)
        Arrays.sort(xy, (a1, a2) -> {
            if(a1[0] == a2[0]) {
                return a1[1] - a2[1];
            } else {
                return a1[0] - a2[0];
            }
        });
        for(int i = 0; i < n; i++) {
            System.out.println(xy[i][0] + " " + xy[i][1]);
        }
    }
}
