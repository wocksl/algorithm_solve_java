package src.BOJ.BOJ2577;//나는 굉장히 더럽게 푼거였다...

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = a * b * c;

        String s = Integer.toString(result);
        char[] arr1 = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr1[i] = s.charAt(i);
        }

        int[] arr2 = new int[10];

        for(int i = 0; i < s.length(); i++){
            if (arr1[i] == '0') arr2[0] += 1;
            else if (arr1[i] == '1') arr2[1] += 1;
            else if (arr1[i] == '2') arr2[2] += 1;
            else if (arr1[i] == '3') arr2[3] += 1;
            else if (arr1[i] == '4') arr2[4] += 1;
            else if (arr1[i] == '5') arr2[5] += 1;
            else if (arr1[i] == '6') arr2[6] += 1;
            else if (arr1[i] == '7') arr2[7] += 1;
            else if (arr1[i] == '8') arr2[8] += 1;
            else if (arr1[i] == '9') arr2[9] += 1;
        }
        for(int i = 0; i <= 9; i++){
            System.out.println(arr2[i]);
        }
    }
}
