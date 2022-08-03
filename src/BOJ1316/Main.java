package src.BOJ1316;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for(int i = 0; i < n; i++){
            String s = sc.next();
            boolean[] checker = new boolean[26];
            boolean temp = true;

            for (int j = 0; j < s.length(); j++){
                int x = s.charAt(j) - 'a';
                if(checker[x]){
                    if(s.charAt(j) != s.charAt(j-1)){temp = false; break;}
                }
                else {checker[x] = true;}
            }
            if(temp) {count++;}
        }
        System.out.println(count);
    }
}
