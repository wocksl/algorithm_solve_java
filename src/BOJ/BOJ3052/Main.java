package src.BOJ.BOJ3052;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[10];
        for(int i = 0; i < 10; i++){
            arr1[i] = sc.nextInt();
        }

        for(int i = 0; i < 10; i++){
            arr1[i] %= 42;
        }

        arr1 = Arrays.stream(arr1).distinct().toArray();
        System.out.println(arr1.length);
    }
}
