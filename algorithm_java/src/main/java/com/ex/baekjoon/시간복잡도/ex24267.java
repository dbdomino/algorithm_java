package com.ex.baekjoon.시간복잡도;

import java.util.Scanner;

public class ex24267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        for (long i=1; i<=n;i++){
//            System.out.println( (i-1)*(i-2)/2);
            sum += (i-1)*(i-2)/2;
        }
        System.out.println(sum);
        System.out.println(3);
        sc.close();
    }
}
