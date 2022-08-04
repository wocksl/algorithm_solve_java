package src.BOJ.BOJ2675;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int r = sc.nextInt();   //반복횟수 r
            String s = sc.next();   //문자열 s
            String result = "";
            // 문자열 s에 포함된 각 문자를 하나씩 확인하며
            for(int j = 0; j < s.length(); j++){
                //해당 문자를 r번만큼 반복
                char x = s.charAt(j);
                for(int k = 0; k < r; k++){
                    result += Character.toString(x);
                }
            }
            System.out.println(result);
        }
    }
}
