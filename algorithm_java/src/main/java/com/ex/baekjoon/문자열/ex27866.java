package com.ex.baekjoon.문자열;

import java.util.Scanner;

public class ex27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
//        System.out.println(str.indexOf(3)); // indexOf() 는 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반환하며 만약 찾지 못했을 경우 "-1"을 반환합니다
        System.out.println(str.charAt(n-1));


        sc.close();

    }
}
