package src.programmers.정렬.k번째수;

import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++){
            ArrayList<Integer> index = new ArrayList<>();
            for(int j = commands[i][0] - 1; j < commands[i][1]; j++){
                index.add(array[j]);
            }
            Collections.sort(index);
            answer[i] = index.get(commands[i][2] - 1);
        }
        return answer;
    }
}