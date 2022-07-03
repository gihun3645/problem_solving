package CodeUp;

import java.util.*;

public class q1080 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;

        while(sum < n) {
            sum += i;
            if(sum >= n) System.out.println(i);
            i++;
        }   
    }
}
