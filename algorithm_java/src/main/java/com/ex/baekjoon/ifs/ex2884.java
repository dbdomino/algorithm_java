package com.ex.baekjoon.ifs;

import java.util.Scanner;

public class ex2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //
        if (b - 45 < 0) {
            a -= 1;
            b += 15;
            if (a < 0) {
                a = 23;
            }
        } else {
            b -= 45;
        }
        System.out.print(a+" "+b);


    }
}
