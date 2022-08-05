package src.programmers.월간코드챌린지시즌3;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for (int i : numbers) {
            answer += i;
        }
        return 45 - answer;
    }
}
