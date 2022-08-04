package src.BOJ.BOJ10814;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] s = new String[n][2];
        for(int i = 0; i < n; i++){
            s[i][0] = sc.next();
            s[i][1] = sc.next();
        }
        Arrays.sort(s, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(o1[0] == o2[0]){
                    if(o1[0].length() == o2[0].length()){
                        return o1[0].compareTo(o2[0]);
                    }
                    else {
                        return o1[0].length() - o2[0].length();
                    }
                }
                else{
                    if(o1[0].length() == o2[0].length()){
                        return o1[0].compareTo(o2[0]);
                    }
                    else {
                        return o1[0].length() - o2[0].length();
                    }
                }
            }
        });
        for(int i = 0; i < n; i++){
            System.out.println(s[i][0] + " " + s[i][1]);
        }
    }
}
