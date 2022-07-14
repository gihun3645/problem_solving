package BOJ;

import java.util.*;

public class q2501 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n+1];
        int cnt = 0;

        for(int i=1; i<=n; i++) {
            if(n%i==0) {
                cnt += 1;
                arr[cnt] = i;
            }
        }

        if(cnt>=k) {
            System.out.println(arr[k]);
        } else {
            System.out.println(0);
        }
    }
}
