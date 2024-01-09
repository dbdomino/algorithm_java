package com.ex.baekjoon.inout;

import java.util.Scanner;

// 입력 엔터로 받아서 곱셈하기
public class ex2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // next는 엔터로 받음
        String b = sc.next();
//        int b = sc.nextInt();
        sc.close();

        System.out.println(a * (b.charAt(2)-'0'));
        System.out.println(a * (b.charAt(1)-'0')); // + '0' 하면 이상해짐
        System.out.println(a * (b.charAt(0)-'0'));
        System.out.println(a * Integer.parseInt(b));
    }
}
