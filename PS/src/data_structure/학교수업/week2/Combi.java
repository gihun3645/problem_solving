package data_structure.학교수업.week2;

import java.util.Scanner;

public class Combi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n, r;
            System.out.println("n ? ");
            n = scanner.nextInt();
            if (n <= 0) {
                break;
            }
            System.out.println("r ? ");
            r = scanner.nextInt();
            if (n < r || r < 0)
                break;
            System.out.printf("Combi(%d, %d) = %d\n\n", n, r, combi(n, r));
        }
    }

    public static int combi(int n, int r) {
        if(n ==r || r == 0) {
            return 1;
        }
        return combi(n-1, r) + combi(n-1, r-1);
    }
}


