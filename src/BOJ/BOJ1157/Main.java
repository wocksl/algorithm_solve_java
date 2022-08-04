package src.BOJ.BOJ1157;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++){
            char x = Character.toUpperCase(s.charAt(i));
            int ascii = x - 'A';
            count[ascii]++;
        }
        int maxCount = 0;
        int maxIndex = -1;
        for(int i = 0; i < 26; i++){
            if (count[i] > maxCount){
                maxCount = count[i];
                maxIndex = i;
            }
        }
        boolean duplicated = false;
        for (int i = 0; i < 26; i++){
            if(count[i] == maxCount && i != maxIndex){
                duplicated = true;
            }
        }
        if(duplicated) System.out.println("?");
        else System.out.println((char)(maxIndex + 'A'));
    }
}
