package data_structure.학교수업.week2;

import java.util.Scanner;

public class Euclid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nNmbr1, nNmbr2;
        while (true) {
            System.out.println("Number 1 ? ");
            nNmbr1 = sc.nextInt();
            if(nNmbr1 <= 0)
                break;
            System.out.println("Number 1 ? ");
            nNmbr2 = sc.nextInt();
            System.out.printf("GCD: %d\n\n", euclid(nNmbr1, nNmbr2));
        }
    }


    public static int euclid(int nBig, int nSmall) {
        int nRem = nBig % nSmall;
        if (nRem == 0)
            return nSmall;
        return euclid(nSmall, nRem);
    }
}
