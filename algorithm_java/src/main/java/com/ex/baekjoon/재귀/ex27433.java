package com.ex.baekjoon.재귀;

import java.util.Scanner;

public class ex27433 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextLong();
        System.out.println(factorial(n));
    }
    public static long factorial(long n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}
