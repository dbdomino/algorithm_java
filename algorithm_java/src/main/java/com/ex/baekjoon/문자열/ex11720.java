package com.ex.baekjoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int sum=0;
        for(int i = 0; i<n;i++)
//            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            sum += str.charAt(i) -'0'; // CHAR - '0'  문자를 숫자로 변환하기

        System.out.println(sum);
        br.close();
    }
}
