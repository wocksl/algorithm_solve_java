package src.programmers.greedy.체육복;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] student = new int[n];
        for(int i = 0; i < student.length; i++){
            student[i] = 1;
        }
        for(int i = 0; i < lost.length; i++){
            student[lost[i] - 1] -= 1;
        }
        for(int i = 0; i < reserve.length; i++){
            student[reserve[i] - 1] += 1;
        }
        for(int i = 0; i < n; i++){
            if(i == 0){
                if(student[i] == 2){
                    if(student[i + 1] == 0){
                        student[i] -= 1;
                        student[i + 1] += 1;
                    }
                }
            }
            else if(i == n - 1){
                if(student[i] == 2){
                    if(student[i - 1] == 0){
                        student[i] -= 1;
                        student[i - 1] += 1;
                    }
                }
            }
            else{
                if(student[i] == 2){
                    if(student[i - 1] == 0){
                        student[i] -= 1;
                        student[i - 1] += 1;
                    }
                    else if(student[i + 1] == 0){
                        student[i] -= 1;
                        student[i + 1] += 1;
                    }
                }
            }
        }
        int answer = n;
        for(int i = 0; i < n; i++) {
            if(student[i] == 0){
                answer--;
            }
        }
        return answer;
    }
}