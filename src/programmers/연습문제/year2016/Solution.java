package src.programmers.연습문제.year2016;

class Solution {
    public String solution(int a, int b) {
        String answer = new String();
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int add_days = 0;
        for(int i = 0; i < a - 1; i++){
            add_days += month[i];
        }
        add_days += b;
        answer = days[add_days % 7];
        return answer;
    }
}