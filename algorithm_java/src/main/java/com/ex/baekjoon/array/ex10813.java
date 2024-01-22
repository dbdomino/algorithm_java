package com.ex.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] nArr = new int[n];
        for (int i=0; i < n; i++) {
            nArr[i] = i+1;
        }

        int tmp;

        for (int i=0; i < m; i++) {
            st= new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1; // a위치
            int b = Integer.parseInt(st.nextToken()) - 1; // b위치
            tmp = nArr[a];
            nArr[a] = nArr[b];
            nArr[b] = tmp;
        }
        StringBuilder sb = new StringBuilder();
        Arrays.stream(nArr)
                .forEach(ns -> {sb.append(ns).append(" ");});
//                forEach(n -> {sb.append(n).append(" ");});

//
//        for (int i = 0; i < n; i++) {
//            sb.append(nArr[i]).append(" ");
//        }

        System.out.println(sb);
    }
}
