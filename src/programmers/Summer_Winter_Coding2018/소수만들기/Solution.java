package src.programmers.Summer_Winter_Coding2018.소수만들기;

class Solution {
    public static boolean is_prime(int number) {
        if(number < 2) {
            return false;
        }
        if(number == 2) {
            return true;
        }
        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public int solution(int[] nums) {
        int num = 0;
        int answer = 0;
        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                for(int k = j + 1; k < nums.length; k++){
                    num = nums[i] + nums[j] + nums[k];
                    if(is_prime(num)) answer++;
                }
            }
        }
        return answer;
    }
}