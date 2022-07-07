package CodeUp;

import java.util.*;

public class q1092 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n=1;
        while(a!=0&&b!=0&&c!=0) {
            if(n%a==0&&n%b==0&&n%c==0) break;
            n++;
        }
        System.out.println(n);
    }
}
