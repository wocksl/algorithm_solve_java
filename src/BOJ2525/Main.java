package src.BOJ2525;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int total_Min = a * 60 + b + c;
        total_Min %= 1440;
        int hour = total_Min / 60;
        int minute = total_Min % 60;

        System.out.println(hour + " " +  minute);
    }
}
