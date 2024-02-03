package com.ex.baekjoon.배수와약수;

import java.util.Scanner;

public class ex2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;
        int val = 0;
        int tmp = 0;
        while(cnt != k) {
            val++;
//            System.out.println("n % val : " +(n % val) +" , val = "+val);
            if (n % val == 0){

                cnt++;
                tmp = val;

            }


            if(val == n) break;
        }
        if (cnt <k ) System.out.println(0);
        else System.out.println(tmp);

        sc.close();
    }
}
