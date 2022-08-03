package src.BOJ2588;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int x_1 = b % 10;
        int x_2 = (b/10) % 10;
        int x_3 = (b/100);

        System.out.println(a * x_1);
        System.out.println(a * x_2);
        System.out.println(a * x_3);
        System.out.println(a * b);
    }
}
