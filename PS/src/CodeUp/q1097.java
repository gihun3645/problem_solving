package CodeUp;

import java.util.*;

public class q1097 {

    public static void main(String[] args) {
        
        int[][] arr = new int[19][19];
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int R = sc.nextInt();
            int C = sc.nextInt();
            // 행
            for(int j=0; j<19; j++) {
                if(arr[j][C-1]==0) arr[j][C-1]=1;
                else arr[j][C-1]=0; 
            }
            // 열
            for(int k=0; k<19; k++) {
                if(arr[R-1][k]==0) arr[R-1][k]=1;
                else arr[R-1][k]=0; 
            }
        }

        // 행열 출력
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]+" "); // 열 출력
            }
            System.out.println(); // 행 출력
        }
    }
}
