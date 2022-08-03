package src.BOJ4673;

class Test {
    static int d(int n){
        int result = n;
        while(true){
            result += n%10;
            n /= 10;
            if (n == 0) break;
        }
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        boolean[] check = new boolean[10001];

        for(int i = 1; i < check.length; i++){
            int check_d = Test.d(i);
            if(check_d < 10001) check[check_d] = true;
        }

        for(int i = 1; i < check.length; i++){
            if (check[i] == false) System.out.println(i);
        }
    }
}
