package com.ex.baekjoon.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a); // 오름차순 정렬

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine()," ");
//        int[] b = new int[n];
//        for (int j = 0; j < m; j++) {
//            b[j] = Integer.parseInt(st.nextToken());
//        }
        // -------------------------------

        for (int j = 0; j < m; j++) {
//            int key = b[j];
            int key = Integer.parseInt(st.nextToken());;
            if (Arrays.binarySearch(a,key) < 0) { // 배열의 이진탐색
                // 값 없음
                System.out.println("0");
            } else {
                // 값 있음
                System.out.println("1");
            }
        }
    }
}
