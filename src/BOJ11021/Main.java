package src.BOJ11021;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for(int i = 1; i <= testCase; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Case #" + i + ": " + (a + b));
        }
    }
}
