package com.ex.baekjoon.loop;

import java.util.Scanner;

public class ex2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuffer sb = new StringBuffer();
//        for (int i = 1; i <= n; i++){
//            for(int j = 1; j <= n-i; j++) {
//                sb.append(" ");
//            }
//            for(int j = 1; j <= i; j++) {
//                sb.append("*");
//            }
//            sb.append("\n");
//        }
        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++) {
                sb.append(" ");
            }
            for(int j = 1; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
