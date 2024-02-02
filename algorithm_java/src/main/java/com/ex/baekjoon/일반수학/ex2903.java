package com.ex.baekjoon.일반수학;

import java.util.Scanner;

// 중앙 이동 알고리즘
public class ex2903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j = (int) Math.pow(2,n)+1;
//        System.out.println(j);//1 - 2
                              //2 - 3
                              //3 - 5
                              //4 - 9
        System.out.println(j*j);

        sc.close();
    }
}
