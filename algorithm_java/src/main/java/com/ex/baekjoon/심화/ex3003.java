package com.ex.baekjoon.심화;

import java.util.Scanner;

public class ex3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= {1,1,2,2,2,8};
        // 킹 퀸 룩 비숍 나이트 폰
        for(int i = 0; i<arr.length;i++){
            int a = sc.nextInt();
            if (a != arr[i]) {// 올바르게 들어오지않음
                arr[i] = arr[i] - a;
            } else {
                arr[i] =0; // 잘들어옴
            }
            System.out.print(arr[i]+" ");
        }

        sc.close();

    }
}
