package BOJ;

import java.util.*;

public class q2846 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int area = sc.nextInt();
        int[] news = new int[5];

        for(int i=0; i<5; i++) {
            news[i] = sc.nextInt();
        }
        for(int i=0; i<5; i++) {
            System.out.print(news[i] - (n*area)+" ");;
        }
    }
}
