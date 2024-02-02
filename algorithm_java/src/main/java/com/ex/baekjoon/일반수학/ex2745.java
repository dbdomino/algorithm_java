package com.ex.baekjoon.일반수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// n진수 -> 10진수 변환
public class ex2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        int b = Integer.parseInt(st.nextToken()); // 진수
        br.close();
        char A = 'A';// 65
        char B = '9';// 57
        char C = '1';// 49

        int result=0;
        int pow = 1;

        for (int i=s.length()-1; i>=0;i--) {
            char o = s.charAt(i);

            if ('0' <= o && '9' >= o ){
                result += (o-'0') * pow;
            } else {
                result += (o-'A'+10) * pow;// o는 어짜피 A부터 올것이기에 +10해준걸 곱해도된다.
            }
            pow *= b;
        }

        System.out.println(result);

    }
}
