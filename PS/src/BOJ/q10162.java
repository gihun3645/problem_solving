package BOJ;

import java.util.*;

public class q10162 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] cnt = new int[3];
        int temp = T;

        if(T >= 300) {
            cnt[0] = T / 300;
            temp = T % 300;
        }
        if(temp >= 60) {
            cnt[1] = temp / 60;
            temp = temp % 60;
        }
        if(temp >= 10) {
            cnt[2] = temp / 10;
            temp = temp % 10;
        }

        if(temp != 0) {
            System.out.println(-1);
        } else {
            for(int c : cnt) {
                System.out.print(c);
                System.out.print(" ");
            }
        }
    }
}