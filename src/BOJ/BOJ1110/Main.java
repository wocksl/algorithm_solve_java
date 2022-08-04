package src.BOJ.BOJ1110;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
        int result = 0;
        int i = 0;
        if(n < 10){
            a = 0;
            b = n;
            result = a % 10 + b;
            while (true) {
                a = b;
                b = result % 10;
                result = a + b;
                i++;
                if (a*10 + b == n) break;
            }
        }
        else {
            a = n / 10;
            b = n % 10;
            result = a + b;
            while(true) {
                a = b;
                b = result % 10;
                result = a + b;
                i++;
                if (a*10 + b == n) break;
            }
        }
        System.out.println(i);
    }
}
