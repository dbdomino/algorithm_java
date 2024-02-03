package com.ex.baekjoon.배수와약수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex9506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        while(true) {
            int n = sc.nextInt();
            if(-1 == n) break;
            sum = 0;
            List<Integer> alist = new ArrayList();
            for (int i=1; i<n; i++){
                if (n % i == 0) {
                    sum += i;
                    alist.add(i);
                }
            }
            if (sum == n) {
                System.out.print(n+" = ");
                int[] aaa = alist.stream().mapToInt(i->i.intValue()).toArray();
                for(int i=0; i<aaa.length; i++) {
                    if(i == aaa.length-1)
                        System.out.print(aaa[i]);
                    else
                        System.out.print(aaa[i] + " + ");
                }
                System.out.println();
            } else {
                System.out.println(n+" is NOT perfect.");
            }


        }

        sc.close();
    }
}
