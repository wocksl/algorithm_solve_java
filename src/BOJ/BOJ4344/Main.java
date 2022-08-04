package src.BOJ.BOJ4344;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for(int i = 0; i < testCase; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int sumValue = 0;
            int index = 0;
            for(int j = 0; j < n; j++){
                int Val = sc.nextInt();
                arr[j] = Val;   //모든 학생 점수 배열
                sumValue += Val;//학생 점수 합
            }
            int avg = sumValue / n;
            for(int k = 0; k < n; k++){
                if (arr[k] > avg){
                    index++;
                }
            }
            double ratio = 0;
            ratio = 100 * (double)index / n;
            System.out.println(String.format("%.3f", ratio) + "%");
        }

    }
}
