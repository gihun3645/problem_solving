package CodeUp;

import java.util.*;

public class q1098 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] arr = new int[h+1][w+1];
        int n = sc.nextInt(); // 입력 횟수

        for(int i=0; i<n; i++) {
            int l = sc.nextInt(); // 막대의 길이(l개)
            int d = sc.nextInt(); // 막대의 방향
            int x = sc.nextInt(); // 세로(모양만 x)
            int y = sc.nextInt(); // 가로(모양만 y)

            if(d==0) { // 가로 방향
                for(int j=0; j<l; j++) {
                    arr[x][y+j] = 1;
                }
            } else if(d==1) { // 세로 방향
                for(int k=0; k<l; k++) {
                    arr[x+k][y] = 1;
                }
            }
        }

        // 결과 출력
        for(int i=1; i<=h; i++) {
            for(int j=1; j<=w; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}