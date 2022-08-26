package src.programmers.연습문제.문자열다루기기본;

class Solution {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || '9' < s.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}