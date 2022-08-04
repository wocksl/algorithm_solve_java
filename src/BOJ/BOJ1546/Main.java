package src.BOJ.BOJ1546;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr1 = new double[n];
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextFloat();
        }

        double maxValue = 0;
        for(int i = 0; i < n; i++){
            if (maxValue < arr1[i]){
                maxValue = arr1[i];
            }
        }
        for(int i = 0; i < n; i++){
            arr1[i] = arr1[i] / maxValue * 100;
        }
        double result = 0;
        for (int i = 0; i < n; i++){
            result += arr1[i];
        }
        System.out.println(result / (double)n);
    }
}
