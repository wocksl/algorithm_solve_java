package src.BOJ.BOJ2884;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int index = 0;
        int indexHour = 0;
        int indexMin = 0;

        index = hour * 60 + min - 45;

        if (index < 0) {
            indexHour = 23;
            indexMin = 60 + index;
        }
        else {
            indexHour = index / 60;
            indexMin = index % 60;
        }

        System.out.println(indexHour + " " + indexMin);
    }
}
