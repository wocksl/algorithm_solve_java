package src.BOJ.BOJ10870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int fibonacci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonacci(n -1) + fibonacci(n -2);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        System.out.println(fibonacci(N));
        }
}
