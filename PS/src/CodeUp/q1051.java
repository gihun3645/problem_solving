package CodeUp;

import java.util.*;

public class q1051 {
    // 한글이 정상적으로 입력할 수 있음
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if (b >= a) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }
}