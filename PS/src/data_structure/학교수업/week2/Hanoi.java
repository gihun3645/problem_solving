package data_structure.학교수업.week2;

import java.util.Scanner;

public class Hanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int nCtr;
            System.out.println("Disks ? ");
            nCtr = sc.nextInt();
            hanoi(nCtr, 1, 2);
            System.out.println();
        }
    }

    public static void hanoi(int nDisk, int nFrom, int nTo) {
        if(nDisk == 1) {
            System.out.printf("%d --> %d\n", nFrom, nTo);
            // hanoi 함수 내에서 재귀 호출을 끝내고, 함수를 종료하는 역할을 함
            return;
        }
        int x = 6 - nFrom - nTo;
        hanoi(nDisk-1, nFrom, x);
        hanoi(1, nFrom, nTo);
        hanoi(nDisk-1, x, nTo);
    }
}
