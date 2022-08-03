package src.BOJ2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static boolean primeNumber(int x){
        //이 조건이 없으면 틀림
        if(x == 1) return false;
        for(int i = 2; i <= Math.sqrt(x); i++){
            if(x % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = m; i <= n; i++){
            if(primeNumber(i)){
                arr.add(i);
            }
        }
        if(arr.isEmpty()){
            System.out.println(-1);
        }else {
            int sum = 0;
            int minValue = n;
            for (int i = 0; i < arr.size(); i++) {
                sum += arr.get(i);
                if (arr.get(i) < minValue) minValue = arr.get(i);
            }
            System.out.println(sum + "\n" + minValue);
        }
    }
}
