package com.ex.baekjoon.inout;

import java.util.Scanner;

public class ex10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C
        System.out.printf("%d\n",(a+b)%c);
        System.out.printf("%d\n",((a%c) + (b%c))%c);
        System.out.printf("%d\n",(a*b)%c);
        System.out.printf("%d\n",((a%c) * (b%c))%c);
    }
}
