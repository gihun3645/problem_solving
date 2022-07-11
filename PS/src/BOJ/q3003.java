package BOJ;

import java.util.*;

public class q3003 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int[] ans = new int[6];
        int[] k = {1,1,2,2,2,8};

        for(int i=0; i<6; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        for(int j=0; j<6; j++) {
            ans[j]=k[j]-arr[j];
            System.out.print(ans[j]+" ");
        }
    }
}
