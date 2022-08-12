package src.programmers.kakao2019.실패율;

import java.util.*;

class Solution {
    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] x = new int[N];
        int[] y = new int[N];
        for(int j = 0; j < N; j++){
            for(int i = 0; i < stages.length; i++){
                if(stages[i] >= j + 1) y[j]++;
                if(stages[i] == j + 1) x[j]++;
            }
        }
        HashMap<Integer, Double> map = new HashMap<Integer, Double>();
        for(int i = 1; i <= N; i++){
            if(x[i - 1] == 0) map.put(i, 0.0);
            else map.put(i, (double)x[i - 1] / y[i - 1]);
        }

        ArrayList<Integer> arr = new ArrayList<>(map.keySet());
        Collections.sort(arr, ((o1, o2) -> Double.compare(map.get(o2), map.get(o1))));
        for(int i = 0; i < N; i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}