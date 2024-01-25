package com.ex.baekjoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<n; i++){
            String str = br.readLine();
            int len = str.length();
            sb.append(str.charAt(0)).append(str.charAt(len-1)).append("\n");
        }
        System.out.println(sb);
    }
}
