package com.ex.baekjoon.일반수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 10진수 -> n진수 변환
public class ex11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 10진수
        int b = Integer.parseInt(st.nextToken()); // 진수
        br.close();
        int n2 = n;

        StringBuffer str = new StringBuffer();
        while(n>0) {
            if (n%b <9 ){ // b가 2~9 일때
                str.insert(0,n%b);
            } else { // b가 10이상 일때
                str.insert(0, (char) (n%b-10+'A')); // 알파벳으로 나올것이므로
            }
            n /= b;
        }

        StringBuffer str2 = new StringBuffer();
        while(n2 != 0){
            if(n2%b >= 10) str2.append((char) ((n2 % b) + 'A'-10));
            else str2.append(n2%b);
            n2 /= b;
        }

        System.out.println(str2.reverse().toString());


    }

}
