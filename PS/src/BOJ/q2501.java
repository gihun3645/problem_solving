package BOJ;

import java.util.*;

public class q2501 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        int cnt = 1;

        for(int i=1; i<=n; i++) {
            if(n%i==0) {
                arr[cnt] = i;
                cnt += 1;
            }
        }

        if(cnt>=k) {
            System.out.println(arr[k]);
        } else {
            System.out.println(0);
        }
    }
}
