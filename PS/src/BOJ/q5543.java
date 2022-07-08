package BOJ;

import java.util.*;

public class q5543 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] burger = new int[3];
        int[] drink = new int[2];

        for(int i=0; i<burger.length; i++) burger[i] =sc.nextInt();
        for(int i=0; i<drink.length; i++) drink[i] =sc.nextInt();

        
        int burger_min = burger[0];
        for(int i=0; i<burger.length; i++) {
            if(burger[i]<burger_min) burger_min=burger[i];
        }
        int drink_min = drink[0];
        for(int i=0; i<drink.length; i++) {
            if(drink[i]<drink_min) drink_min=drink[i];
        }

        System.out.println(burger_min+drink_min-50);
    }
}
