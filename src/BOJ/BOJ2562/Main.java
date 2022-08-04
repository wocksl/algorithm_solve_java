package src.BOJ.BOJ2562;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for(int i = 0; i < 9; i++) {
            int x = sc.nextInt();
            arr[i] = x;
        }
        int maxValue = 0;
        int maxIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            if (x > maxValue) {
                maxValue = x;
                maxIndex = i + 1;
            }
        }
        System.out.println(maxValue);
        System.out.println((maxIndex));
    }
}
