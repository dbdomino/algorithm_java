package com.ex.baekjoon.ifs;

import java.util.Scanner;

public class ex2753 {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int result = 0;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            result = 1;
        }
        System.out.println(result);
    }
}
