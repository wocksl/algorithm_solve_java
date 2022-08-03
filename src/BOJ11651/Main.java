package src.BOJ11651;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] xy = new int[n][2];
        /*
        좌표정렬 1번과 다르게 y좌표 기준으로 정렬하므로
        y좌표를 먼저 입력받고 x좌표를 입력받는다
        배열에는 [x, y]가 아닌 [y, x]로 입력을 받고
        Array.sort()로 y좌표 기준으로 정렬한 후
        출력시 x, y를 서로 바꿔서 출력해주면 정상적인 출력 가능
         */
        for(int i = 0; i < n; i++){
            xy[i][1] = sc.nextInt();
            xy[i][0] = sc.nextInt();
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
            System.out.println(xy[i][1] + " " + xy[i][0]);
        }
    }
}
