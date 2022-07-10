package BOJ;

import java.util.*;

public class q11650 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // 수 입력 받기
        int n = sc.nextInt();

        int[][] arr = new int[n][2];
        
        for(int i=0; i<n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        // 배열 정렬하기(이게 이해가 잘 안됨)
        Arrays.sort(arr, (e1, e2) -> {
            if(e1[0] == e2[0]) {
                return e1[1] - e2[1];
            } else {
                return e1[0] - e2[0];
            }
        });

        // 결과 출력
        for(int i=0; i<n; i++) {
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}
