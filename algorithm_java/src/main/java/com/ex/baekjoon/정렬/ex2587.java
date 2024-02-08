package com.ex.baekjoon.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ex2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];

        for(int i=0; i<5; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int size = arr.length/2; // 중간값 위치
        double avg = Arrays.stream(arr).average().orElse(1);
        int intValue = (int) Math.ceil(avg); // 소수점 버린 후 형변환
        int sum = Arrays.stream(arr).sum() / 5;
        System.out.println(sum);
        System.out.println(arr[size]);

        br.close();

    }
}
