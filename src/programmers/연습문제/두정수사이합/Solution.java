package src.programmers.연습문제.두정수사이합;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int max = 0;
        int min = 0;
        if(a <= b){
            min = a;
            max = b;
        }
        else {
            min = b;
            max = a;
        }
        for(int i = min; i <= max; i++){
            answer += i;
        }
        return answer;
    }
}