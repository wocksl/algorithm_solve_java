package src.programmers.위클리챌린지.부족금액계산하기;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long result = 0;
        for(int i = 1; i <= count; i++){
            result += price * i;
        }
        answer = result - money;
        if(answer <= 0){
            answer = 0;
        }
        return answer;
    }
}