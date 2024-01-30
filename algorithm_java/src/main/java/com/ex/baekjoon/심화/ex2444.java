package com.ex.baekjoon.심화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ex2444 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // 0~a-1까지
        for(int i = 0; i<=a-1;i++){

            if(i<a) {
                for (int j = 0; j < a - 1 - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i * 2 + 1; j++) {
                    System.out.print("*");
                }

//                for (int j = 0; j < a - 1 - i; j++) {
//                    System.out.print(" ");
//                }
            }
            System.out.println();
        }
        // a -2 부터 0 까지
        for(int i = a-2; i>=0 ;i--){
            for (int j = 0; j < a - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
//            for (int j = 0; j < a - 1 - i; j++) {
//                System.out.print(" ");
//            }
            System.out.println();

        }
        sc.close();


//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n-i; j++) {
//                sb.append(" ");
//            }
//            for (int j = 1; j <= 2*i-1; j++) {
//                sb.append("*");
//            }
//            sb.append("\n");
//        }
//        for (int i = n-1; i >= 1; i--) {
//            for (int j = 1; j <= n-i; j++) {
//                sb.append(" ");
//            }
//            for (int j = 1; j <= 2*i-1; j++) {
//                sb.append("*");
//            }
//            sb.append("\n");
//        }
//        System.out.print(sb);
    }
}
