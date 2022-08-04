package src.BOJ.BOJ10989;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] count = new int[10001];
        
        for (int i = 0; i < N; i++) {
            count[Integer.parseInt(br.readLine())]++;
        }

        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i < 10001; i++) {
            for (int j = 0; j < count[i]; j++) {
                sb.append(i + "\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
