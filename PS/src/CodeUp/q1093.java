package CodeUp;

import java.util.*;

public class q1093 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[23]; // 범위가 1~23 이라서 ? 맞나? 
        int N = sc.nextInt();

        for(int i=0; i<N; i++) { // N번만큼 반복
            arr[sc.nextInt()-1]++;
        }
        for(int i=0; i<arr.length; i++) System.out.print(arr[i] + " ");
    }
}
