package CodeUp;

import java.util.*;

public class q1091 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long m = sc.nextInt();
        long d = sc.nextInt();
        long n = sc.nextInt();
        long sum = a;
        
        for(int i=1; i<n; i++) {
            sum = sum*m +d;
        }

        System.out.println(sum);
    }
}
