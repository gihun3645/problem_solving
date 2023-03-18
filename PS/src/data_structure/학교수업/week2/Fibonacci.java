package data_structure.학교수업.week2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fibonacci fibonacci = new Fibonacci();
        while (true) {
            int n;
            System.out.println("n ? ");
            n = sc.nextInt();
            if(n < 0)
                break;
            System.out.printf("fib(%d) = %d\n\n", n, fibonacci.fib(n));
        }
    }

    // 피보나치 수열을 재귀함수로 표현
    int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
}
