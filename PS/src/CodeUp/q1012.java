package CodeUp;

import java.util.Scanner;

public class q1012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 입력 받기
        double a = scanner.nextDouble();
        System.out.print(String.format("%.6f", a));
        scanner.close();
    }
}
