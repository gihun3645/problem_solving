package CodeUp;

import java.util.*;

public class q1083 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            if((i == 3) | (i == 6) | (i == 9)) {
                System.out.print("X"+" ");
                continue;
            }
            System.out.print(i+" ");
        }
    }
}