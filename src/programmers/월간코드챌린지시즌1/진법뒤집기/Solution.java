package src.programmers.월간코드챌린지시즌1.진법뒤집기;

import java.util.*;

class Solution {
    public int solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int answer = 0;
        while(n != 0){
            arr.add(n%3);
            n /= 3;
        }
        int three = 1;
        for(int i = arr.size() - 1; i >= 0; i--){
            answer += (arr.get(i) * three);
            three *= 3;
        }
        return answer;
    }
}