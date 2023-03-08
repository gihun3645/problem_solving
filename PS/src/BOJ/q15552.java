package BOJ;

import java.io.*;
import java.util.StringTokenizer;

public class q15552 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferReader만 쓰니 시간 초과가남 BufferWritter도 써야함
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < cnt; i++) { // 한줄 입력받는다.
            // 시간초과
//            // 한 줄에 두 개의 정수를 입력받아서 공백을 기준으로 분리
//            String[] input = br.readLine().split(" ");
//
//            // 분리한 두 개의 문자열을 정수로 변환
//            int num1 = Integer.parseInt(input[0]);
//            int num2 = Integer.parseInt(input[1]);
//
//            System.out.println(num1 + num2);
            st = new StringTokenizer(br.readLine(), " ");
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
