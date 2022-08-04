package src.BOJ.BOJ10809;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        for(int i = 0; i < 26; i++){
            arr[i] = -1;
        }
        String s = sc.next();
        for(int i = s.length() - 1; i >= 0; i--) {
            int a = s.charAt(i) - 'a';
            arr[a] = i;
        }
        for(int i = 0; i < 26; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
