package CodeUp;

import java.util.Scanner;

public class nothing {

    public static void main(String[] args) {

        int[][] score = {
            {100, 100, 100},
            {20, 20, 20},
            {30, 30, 30,},
            {40, 40, 40}
        };

        for(int i=0; i<score.length; i++) {
            for(int j=0; j<score[i].length; j++) {
                System.out.print(score[i][j]+" "); // 열 출력
            }
            System.out.println(); // 행 출력
        }
    }
}
