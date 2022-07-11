package CodeUp;

import java.util.*;

public class q1099 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10];
        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int x = 1;
        int y = 1;
        while(true) {
            if(arr[x][y] == 2) {
                arr[x][y] = 9;
                break;
            }
            
            if(arr[x][y+1]==1) {
                if(arr[x+1][y]==1) break;
                else x++;
            } else if(arr[x][y+1]!=1) {
                y++;
            }
            
            if(arr[x][y]==2) {
                arr[x][y] = 9;
                break;
            }
            arr[x][y]=9;
        }
        arr[1][1] = 9;

        // 결과 출력
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
