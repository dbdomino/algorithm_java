package com.ex.baekjoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문자열 반복
public class ex2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            String b = st.nextToken();

            int b_len = b.length();
            char[] b_char_arr = b.toCharArray();

            for(int j = 0; j<b_len; j++) {
                for(int k=0; k < a; k++){
//                    sb.append(b.charAt(j));
                    sb.append(b_char_arr[j]);
                }

            }

//            String[] str = br.readLine().split(" ");
//            int R = Integer.parseInt(str[0]);
//            System.out.println(str[1]);
//            System.out.println(str[1].getBytes()); // byte 배열로 받음
//
//            for (byte val : str[1].getBytes()) {
//                for (int j = 0; j < R; j++) {
//                    sb.append((char)val);
//                }
//            }

            sb.append("\n");

        }
        System.out.print(sb);


    }
}
