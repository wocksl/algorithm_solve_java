package src.BOJ.BOJ2908;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int r_a = (a / 100) + ((a / 10) % 10) * 10 + (a % 10) * 100;
        int r_b = (b / 100) + ((b / 10) % 10) * 10 + (b % 10) * 100;


        if (r_a > r_b) System.out.println(r_a);
        else System.out.println(r_b);
    }
}
