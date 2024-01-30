package com.ex.baekjoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 단어의 개수
public class ex1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String b = br.readLine();
//        String[] b_arr = b.split(" ");
//        System.out.print(b_arr.length); // 실패

        StringTokenizer st = new StringTokenizer(b);
//        StringTokenizer st = new StringTokenizer(b, " ");
        System.out.print(st.countTokens());

        br.close();
    }
}
