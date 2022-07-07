package CodeUp;

import java.util.*;

public class q1090 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 1 3 5
        // 1 4 7 10 13 5번째 주는 13
        long a = sc.nextLong();
        long r = sc.nextLong();
        long n = sc.nextLong();
        long result = (long) (a*(Math.pow(r, n-1)));

        System.out.println(result);
    }
}
