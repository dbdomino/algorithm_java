package com.ex.baekjoon.일반수학;

import java.util.Scanner;

public class ex2292 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt(); // 입력받은 방번호
        sc.close();

        int count = 1; // 겹수
        int range = 2; // 범위

        if (n==1 ) System.out.println(1);
        else {
            while (range <= n) {
                range += 6*count; // 육각형은 한칸넓어질때마다 6식증가
                count++;
            }
            System.out.println(count);
        }

    }
}
