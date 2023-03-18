package data_structure.학교수업.week2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Factorial factorial = new Factorial();
        while (true) {
            int n;
            System.out.println("n ? : ");
            n = sc.nextInt();
            if(n < 0)
                break;
            System.out.printf("%d! = %d\n\n", n, factorial.fac(n));
        }
    }

    public int fac(int n) {
        if (n == 0)
            return 1;
        int nFact = fac(n - 1);
        return n * nFact;
    }
}
