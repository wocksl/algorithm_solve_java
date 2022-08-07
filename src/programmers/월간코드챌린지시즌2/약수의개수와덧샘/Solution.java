package src.programmers.월간코드챌린지시즌2.약수의개수와덧샘;

class Solution {
    public static int divisor_cnt (int x){
        int count = 0;
        for(int i = 1; i <= x; i++){
            if(x % i == 0) count++;
        }
        return count;
    }
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++){
            if(divisor_cnt(i) % 2 == 0) answer += i;
            else answer -= i;
        }
        return answer;
    }
}