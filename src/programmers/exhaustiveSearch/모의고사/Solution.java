package src.programmers.exhaustiveSearch.모의고사;

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[][] stu = {{1, 2, 3, 4 , 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for(int j = 0; j < stu.length; j++){
            int result = 0;
            for(int i = 0; i < answers.length; i++){
                if(answers[i] == stu[j][i % stu[j].length]){
                    result++;
                }
            }
            list1.add(result);
        }
        int max_result = -1;
        for(int i = 0; i < 3; i++){
            if(max_result < list1.get(i)){
                max_result = list1.get(i);
            }
        }
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int i = 0; i < 3; i++){
            if(max_result == list1.get(i)){
                list2.add(i + 1);
            }
        }
        int[] answer = new int[list2.size()];
        for(int i =0; i<answer.length; i++) {
            answer[i] = list2.get(i);
        }
        return answer;
    }
}