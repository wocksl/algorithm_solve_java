package src.BOJ5622;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        int result = 0;

        for(int i = 0; i < arr.length; i++){
            if (arr[i] == 'A' || arr[i] == 'B' || arr[i] == 'C') result += 3;
            else if (arr[i] == 'D' || arr[i] == 'E' || arr[i] == 'F') result += 4;
            else if (arr[i] == 'G' || arr[i] == 'H' || arr[i] == 'I') result += 5;
            else if (arr[i] == 'J' || arr[i] == 'K' || arr[i] == 'L') result += 6;
            else if (arr[i] == 'M' || arr[i] == 'N' || arr[i] == 'O') result += 7;
            else if (arr[i] == 'P' || arr[i] == 'Q' || arr[i] == 'R' || arr[i] == 'S') result += 8;
            else if (arr[i] == 'T' || arr[i] == 'U' || arr[i] == 'V') result += 9;
            else if (arr[i] == 'W' || arr[i] == 'X' || arr[i] == 'Y' || arr[i] == 'Z') result += 10;
        }
        
        System.out.println(result);
    }
}
