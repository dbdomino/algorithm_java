package com.ex.baekjoon.일반수학;

import java.util.Scanner;

public class ex2720 {
    public static void main(String[] args) {
        int[] arr0 = {25, 10, 5, 1};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i<n; i++){
            int n1 = sc.nextInt();
            for (int j = 0; j< 4; j++) {
                if (n1 / arr0[j] >0) sb.append(n1 / arr0[j] +" ");
                else sb.append("0 ");
                n1 = n1 % arr0[j];

            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
