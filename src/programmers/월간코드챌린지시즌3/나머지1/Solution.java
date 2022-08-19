package src.programmers.월간코드챌린지시즌3.나머지1;

class Solution {
    public int solution(int n) {
        int answer = 1;
        while(n % answer != 1){
            answer++;
        }
        return answer;
    }
}