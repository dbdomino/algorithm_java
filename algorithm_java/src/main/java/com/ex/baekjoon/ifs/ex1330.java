package com.ex.baekjoon.ifs;

import java.util.Scanner;

public class ex1330 {
    private static void doit(int a, int b) {
        if (a < b) System.out.println("<");
        else if (a > b) System.out.println(">");
        else if (a == b) System.out.println("==");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        doit(a, b);
    }
}
