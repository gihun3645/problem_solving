package BOJ;

import java.util.*;

public class q1152 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();

        if(str.isEmpty()) {
            System.out.println(0);
        }else {
            System.out.println(str.split(" ").length);
        }
    }
}
