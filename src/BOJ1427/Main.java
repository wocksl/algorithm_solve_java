package src.BOJ1427;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        Integer[] arr = new Integer[s.length()];
        for (int i = 0; i < s.length(); i++) { arr[i] = s.charAt(i) - '0'; }
        Arrays.sort(arr, Comparator.reverseOrder());

        for(int i : arr) {
            System.out.print(i);
        }
    }
}
