package src.BOJ.BOJ2439;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int y = n-1; y>i; y--) {
                System.out.print(" ");
            }
            for(int x = 0; x <= i; x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
