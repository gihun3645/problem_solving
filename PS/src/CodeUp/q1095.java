package CodeUp;

import java.util.*;

public class q1095 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i]=sc.nextInt();
        // 출석을 부른 번호 중에 가장 빠른 번호(가장 작은 수) 1개만 
        int min = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(arr[i]<min) min=arr[i];
        }
        System.out.println(min);
    }
}
