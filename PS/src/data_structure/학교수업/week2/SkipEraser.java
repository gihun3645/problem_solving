package data_structure.학교수업.week2;

import java.util.Scanner;

public class SkipEraser {
    static int N = 1000;
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("? ");
            int n;
            n = sc.nextInt();
            if(N < n || n <= 0)
                break;
            System.out.printf("Simulation : %d\n", skipEraser1(n));
            System.out.printf("Simulation : %d\n", skipEraser2(n));
            System.out.printf("Recursion : %d\n\n", skipEraser3(n));
        }
    }

    public static int skipEraser1(int n) {
        int nNdx =1;
        // 목걸이를 배열로 정의한다(1에서 n까지)
        // 목걸이 n개의 구슬을 1에서 n까지 초기화 한다
        int[] nNecklace = new int[N];
        for(int i=1; i<=n; i++)
        {
            nNecklace[i] = i;
        }
        for(int i=1; i<n; i++) {
            // 구슬을 지우기 위한 목적
            nNecklace[nNdx = nextBeadNdx(nNecklace, nNdx, n)] = 0;
            nNdx = nextBeadNdx(nNecklace, nNdx, n);
        }
        return nNecklace[nNdx];
    }

    public static int nextBeadNdx(int nNecklace[], int nNdx, int nMod)
    {
        while(nNecklace[nNdx = nextNdx(nNdx, nMod)] == 0);
        return nNdx;
    }

    public static int nextNdx(int nNdx, int nMod) {
        return nNdx % nMod +1;
    }

    public static int skipEraser2(int n) {
        // 자바에서 N길이의 변수를 선언하기
        int[] nNecklace = new int[N];
        for(int i=0; i<n; i++) {
            nNecklace[i] = i + 1;
        }
        while (1<n) {
            for(int nTo=0, nFrom=(n%2)*2, nHalf=n/2; nTo<nHalf; nTo++, nFrom+=2) {
                nNecklace[nTo] = nNecklace[nFrom];
            }
            n/=2;
        }
        return nNecklace[0];
    }

    // 순환함수로 작성
    public static int skipEraser3(int n) {
        if( n == 1) {
            return 1;
        }
        // [일반규칙] f(n) ::= 2f(n/2) +(-) 1;; n이 짝수 -, 홀수 +
        // ((n % 2) * 2) -1
        // n이 짝수면 -1 홀수면 1
        System.out.println((2 * skipEraser3(n / 2)) + ((n % 2) * 2) -1);
        return (2 * skipEraser3(n / 2)) + ((n % 2) * 2) -1;
    }
}
