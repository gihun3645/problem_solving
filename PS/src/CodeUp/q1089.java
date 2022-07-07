package CodeUp;

import java.util.*;

public class q1089 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 1 3 5
        // 1 4 7 10 13 5번째 주는 13
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(a+(n-1)*d);
    }
}
