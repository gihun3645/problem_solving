package CodeUp;

import java.util.*;

public class q1096 {
    
    public static void main(String[] args) {
        
        int[][] arr = new int[19][19];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            arr[N-1][M-1] = 1;
        }
        // 이차원 배열 출력하기
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]+" "); // 열 출력
            }
            System.out.println(); // 행 출력
        }
    }
}
