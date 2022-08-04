package src.BOJ.BOJ2108;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){ arr[i] = Integer.parseInt(br.readLine()); }
        Arrays.sort(arr);

        //산술평균
        double result = 0;
        for(double i : arr) { result += i; }
        System.out.println(Math.round(result/n));

        //중앙값
        System.out.println(arr[(n-1) / 2]);

        //최빈값
        int cnt = 0;
        int max = -1;
        int val = arr[0];
        boolean check = false;
        for(int i = 0; i < n-1; i++) {
            if(arr[i] == arr[i+1]) { cnt++; }
            else { cnt = 0; }

            if(max < cnt) {
                max = cnt;
                val = arr[i];
                check = true;
            }
            else if(max == cnt && check == true) {
                val = arr[i];
                check = false;
            }
        }
        System.out.println(val);

        //범위
        System.out.println(arr[n-1] - arr[0]);
    }
}
