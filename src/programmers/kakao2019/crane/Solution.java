package src.programmers.kakao2019.crane;

import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> basket = new Stack<>();
        basket.push(0);
        int answer = 0;
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    if (basket.peek() == board[j][moves[i] - 1]) {
                        basket.pop();
                        board[j][moves[i] - 1] = 0;
                        answer += 2;
                    } else {
                        basket.push(board[j][moves[i] - 1]);
                        board[j][moves[i] - 1] = 0;
                    }
                    break;
                }
            }
        }
        return answer;
    }
}
