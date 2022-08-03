package src.BOJ1181;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int i = 0; i < n; i++){
            s[i] = sc.next();
        }
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) { //단어의 길이가 같을경우
                    return o1.compareTo(o2);
                }
                else{//단어의 길이가 다를경우
                    return o1.length() - o2.length();
                }
            }});
        System.out.println(s[0]);
        for(int i = 1; i < n; i++){
            if(!s[i].equals(s[i-1])) {
                System.out.println(s[i]);
            }
        }
    }
}
