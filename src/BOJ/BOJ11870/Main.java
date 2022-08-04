package src.BOJ.BOJ11870;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 데이터 개수
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++)
            arr.add(sc.nextInt());
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) set.add(x);
        ArrayList<Integer> unique = new ArrayList<>(set);
        Collections.sort(unique);

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < unique.size(); i++) {
            map.put(unique.get(i), i);
        }

        StringWriter stringWriter = new StringWriter();
        BufferedWriter buffWriter = new BufferedWriter(stringWriter);
        for (int x : arr) buffWriter.write(map.get(x) + " ");
        buffWriter.flush();
        System.out.println(stringWriter.getBuffer());
    }
}
