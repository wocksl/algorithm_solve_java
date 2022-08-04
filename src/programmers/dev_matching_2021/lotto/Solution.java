package src.programmers.dev_matching_2021.lotto;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int count = 0;
        int countZero = 0;
        for(int i = 0; i < lottos.length; i++){
            if(lottos[i] == 0) countZero++;
            for(int j = 0; j < win_nums.length; j++){
                if(lottos[i] == win_nums[j]) count++;
            }
        }

        int minRank = Math.min(7 - count, 6);
        int maxRank = Math.min(7 - (count + countZero), 6);
        int[] answer = {maxRank, minRank};
        return answer;
    }
}

