package src.BOJ.BOJ1541;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer sub = new StringTokenizer(sc.nextLine(), "-");
        int result = Integer.MAX_VALUE;
        while(sub.hasMoreTokens()){
            int temp = 0;
            StringTokenizer add = new StringTokenizer(sub.nextToken(), "+");
            while(add.hasMoreTokens()){
                temp += Integer.parseInt(add.nextToken());
            }
            if (result == Integer.MAX_VALUE){
                result = temp;
            }
            else{
                result -= temp;
            }
        }
        System.out.println(result);
    }
}
