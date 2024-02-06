package com.ex.baekjoon.시간복잡도;

import java.util.Scanner;

public class ex24313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a1 = sc.nextLong();
        long a0 = sc.nextLong();
        long c = sc.nextLong();
        long n = sc.nextLong();
        int result = 0;

        if (a1*n + a0 <= c*n && a1 <= c) result = 1;

        System.out.println(result);
        sc.close();
    }
}
