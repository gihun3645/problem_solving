package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class q1037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        scanner.nextLine();  // 개행 문자 제거
        String input = scanner.nextLine(); // 한 줄을 통째로 입력 받음
        String[] inputArr = input.split(" "); // 공백으로 문자열을 나눔

        int[] num = new int[inputArr.length]; // 정수를 담을 배열 생성

        for (int i = 0; i < cnt; i++) {
            num[i] = Integer.parseInt(inputArr[i]); // 문자열을 정수로 변환하여 배열에 저장
        }

        // 정렬
        Arrays.sort(num);
        // 정렬된거 출력
        System.out.println(num[cnt-1]*num[0]);

    }
}
