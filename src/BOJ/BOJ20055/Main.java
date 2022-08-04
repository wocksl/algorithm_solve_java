package src.BOJ.BOJ20055;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static int N, K;
    public static int[] arr;
    public static boolean[] robot;
    public static boolean K_check(){
        int cnt = 0;
        for(int i = 0; i < 2*N; i++){
            if(arr[i] == 0) cnt++;
        }
        if(cnt >= K) return false;
        else return true;
    }
    public static int simulate() {
        int cnt = 0;
        while(K_check()){
            //벨트의 회전
            int temp = arr[arr.length - 1];
            for(int i = arr.length - 1; i > 0; i--){
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
            //벨트와 함게 움직이는 로봇
            for(int i = robot.length - 1; i > 0; i--){
                robot[i] = robot[i - 1];
            }
            robot[0] = false;
            robot[robot.length-1] = false;
            //로봇의 이동
            for(int i = robot.length-1; i > 0; i--){
                if(!robot[i] && robot[i-1] && arr[i] >= 1) {
                    robot[i] = true;
                    robot[i-1] = false;
                    arr[i]--;
                }
            }
            //로봇의 재생성
            if(arr[0] > 0){
                robot[0] = true;
                arr[0]--;
            }
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());   //컨베이어 벨트의 단면길이
        K = Integer.parseInt(st.nextToken());   //내구도 0인 벨트의 최대 개수

        arr = new int[2*N];
        robot = new boolean[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 2*N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(simulate());
    }
}
