package src.programmers.월간코드챌린지시즌1.두개뽑아서더하기;

import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int result = 0;
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                result = numbers[i] + numbers[j];
                if(!arr.contains(result)){
                    arr.add(result);
                }
            }
        }
        Collections.sort(arr);
        int[] answer = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}