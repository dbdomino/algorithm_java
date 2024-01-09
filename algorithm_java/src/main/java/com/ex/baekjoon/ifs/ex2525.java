package com.ex.baekjoon.ifs;

import java.util.Scanner;

public class ex2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        b += c;
        if (b + c >= 60) {
            a = b/60 + a;
            b = b%60;
            if (a > 23) {
                a -= 24;
            }
        }
        System.out.println(a + " " + b);

    }
}
