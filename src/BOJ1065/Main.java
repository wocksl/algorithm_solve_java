package src.BOJ1065;

import java.util.*;

public class Main {
    public static boolean hanSu(int x){
        if (x < 100) {return true;}
        else if (x >= 100 && x < 1000){
            int x_1 = x % 10; //일의자리
            int x_2 = (x/10) % 10; //십의자리
            int x_3 = (x/100) % 10; //백의자리
            if(x_1 - x_2 == x_2 - x_3) {return true;}
            else {return false;}
        }
        else {return false;}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++){
            if (hanSu(i)) count++;
        }
        System.out.println(count);
    }
}
