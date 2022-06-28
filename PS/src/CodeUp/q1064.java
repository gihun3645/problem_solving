package CodeUp;

import java.util.Scanner;

public class q1064 {

    public static int min(int a, int b, int c) {
        return (a>b? b>c? c:b : a>c? c:a);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(min(a, b, c));
    }
}
