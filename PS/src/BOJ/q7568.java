package BOJ;

import java.util.*;

public class q7568 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] arr = new int[N][2];

        for(int i = 0; i < N; i++) { // 이차원 배열 생성
            arr[i][0] = sc.nextInt(); // 키
            arr[i][1] = sc.nextInt(); // 몸무게
        }

        for(int i = 0; i < N; i++) {
            int rank = 1;

            for(int j = 0; j < N; j++) {
                if(i == j) continue;
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }
        sc.close();
    }
}