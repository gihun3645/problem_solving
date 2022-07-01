package CodeUp;

import java.util.*;

public class q1068 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if(score >= 90) {
            System.out.println("A");
        } else {
            if((70 <= score) && (score < 90)) {
                System.out.println("B");
            } else {
                if((40 <= score) && (score < 70)) {
                    System.out.println("C");
                } else {
                    System.out.println("D");
                }
            }
        }
    }   
}
