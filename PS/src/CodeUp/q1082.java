package CodeUp;

import java.util.*;

public class q1082 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(16); // 16진수로 받음
        for(int i=1; i<16; i++) {
            System.out.printf("%X*%X=%X\n", n, i, n*i);
        }
    }
}
