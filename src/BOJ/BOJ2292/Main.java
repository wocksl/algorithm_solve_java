package src.BOJ.BOJ2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int count = 1;
        int range = 2;

        if(N == 1) System.out.println(1);
        else{
            while(range <= N){
                range += (6 * count++);
            }
            System.out.println(count);
        }
    }
}
