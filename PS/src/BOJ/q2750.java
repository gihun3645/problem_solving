package BOJ;

import java.util.*;

public class q2750 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N; i++) { // 배열에 N개의 수 집어넣기 
            arr[i] = sc.nextInt();
        }

        // 순서 분류하기
        for(int i=0; i<(N-1); i++) {
            for(int j=(i+1); j<N; j++) {
                if(arr[i] >arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for(int val : arr) {
            System.out.println(val);
        }

    }
}
