package src.BOJ.BOJ8958;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
        }
        int result = 0;
        int count = 0;
        for(int j = 0; j < n; j++) {
            result = 0;
            count = 0;
            for (int i = 0; i < arr[j].length(); i++) {
                if (arr[j].charAt(i) == 'O') {
                    count++;
                    result += count;
                } else {
                    count = 0;
                }
            }
            System.out.println(result);
        }
    }
}
