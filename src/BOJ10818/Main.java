package src.BOJ10818;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int maxValue = -1000000;
        int minValue = 1000000;
        for(int i = 0; i < n; i++){
            if(maxValue < arr[i]){
                maxValue = arr[i];
            }
            if(minValue > arr[i]){
                minValue = arr[i];
            }
        }
        System.out.println(minValue + " " + maxValue);
    }
}
