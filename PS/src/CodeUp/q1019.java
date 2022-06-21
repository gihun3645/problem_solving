package CodeUp;

import java.util.Scanner;

public class q1019 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String date[] = sc.next().split("\\."); // 온점으로 입력 구분하기
        int A = Integer.valueOf(date[0]);
        int B = Integer.valueOf(date[1]);
        int C = Integer.valueOf(date[2]);
        System.out.printf("%04d.%02d.%02d", A, B, C);
    }
}
