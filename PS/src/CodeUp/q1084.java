package CodeUp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q1084 {
    
    public static void main(String[] args) throws IOException{
        
        // 시간 초과
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // int cnt = 0;

        // for(int i=0; i<a; i++) {
        //     for(int j=0; j<b; j++) {
        //         for(int k=0; k<c; k++) {
        //             System.out.println(i+" "+j+" "+k);
        //             cnt+=1;
        //         }
        //     }
        // }
        // System.out.println(cnt);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] a = br.readLine().split(" ");

        int cnt = 0 ;
        for(int i=0; i<Integer.valueOf(a[0]); i++) {
            for(int j=0; j<Integer.valueOf(a[1]); j++) {
                for(int k=0; k<Integer.valueOf(a[2]); k++) {
                    bw.write(i+" "+j+" "+k+"\n");
                    cnt++;
                }
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
    }
}
