package com.ex.baekjoon.ifs;

import java.util.Scanner;

public class ex2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        int result=0;

        if (a == b && a == c) {
            // 3값이 같을때
            result = 10000+a*1000;
        } else {
            // 2값이 같을때
            if (a == b || a == c) {
                result = 1000+a*100;
            } else if (b == c){
                result = 1000+b*100;
            } else {
                //같은값이 없을 때 가장 큰눈찾기
                if (a > b) {
                    if (a > c) result = a*100;
                    else result = c*100;
                } else {
                    if (b > c) result = b*100;
                    else result = c*100;
                }
//                result = Math.max(Math.max(a, b), c) * 100;
            }
        }

        System.out.println(result);
    }

}
