package com.ex.baekjoon.배수와약수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ex2485 {
    public static void main(String[] args) throws IOException {
        // 도로의 한 편에 가로수가 임의의 간격으로 심어져있다. KOI 시에서는 가로수들이 모두 같은 간격이 되도록 가로수를 추가로 심는 사업을
        // 추진하고 있다.
        // KOI 시에서는 예산문제로 가능한 한 가장 적은 수의 나무를 심고 싶다.
        // 가로수의 위치는 기준점으로 부터 떨어져 있는 거리로 표현되며, 가로수의 위치는 모두 양의 정수이다.
        // 예를 들어, 가로수가 (1, 3, 7, 13)의 위치에 있다면 (5, 9, 11)의 위치에 가로수를 더 심으면 모든 가로수들의 간격이 같게 된다.
        // 또한, 가로수가 (2, 6, 12, 18)에 있다면 (4, 8, 10, 14, 16)에 가로수를 더 심어야 한다.

        //  새로 심어야 하는 가로수의 최소수를 첫 번째 줄에 출력한다.
        //  새로 심어야 하는 가로수의 최소수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0 ; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(Arrays.toString(arr));


        // 해답  // 차이들의 모든 gcd 최소공배수 구해서
        Arrays.sort(arr); // 오름차순정렬, 확실하게,
        int gcd=0;
        for(int i=0;i<n-1;i++){
            int distance=arr[i+1]-arr[i];
            gcd = gcd(distance,gcd);
        }
        System.out.println(gcd);

        // 공식: 일정한 간격의 수의 개수 구하기 -> (마지막값 -처음값)/(값의차이=최소공배수) +1
        // 일정 간격마다 심고난뒤 나무 수 - 처음부터 심긴 나무 수
        System.out.println((arr[n-1]-arr[0])/gcd+1-(arr.length));

        br.close();
    }


    static public int gcd(int a, int b) {
        while (b > 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;

    }
}
