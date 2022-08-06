package src.programmers.해시.완주하지못한선수;

import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        for (int i = 0; i < completion.length; i++){
            if (!participant[i].equals(completion[i])){
                answer = participant[i];
            }
        }
        if(answer == ""){
            answer = participant[participant.length - 1];
        }
        return answer;
    }
    /*
    //풀고나서 생각해보니 answer를 쓰지 않고 participant[i]를 바로 반환하면 시간절약이 가능할것 같음
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        for (int i = 0; i < completion.length; i++){
            if (!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[participant.length - 1];
    }
     */
}