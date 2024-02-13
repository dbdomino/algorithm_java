package com.ex.baekjoon.배수와약수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex4134 {
    // n보다 크거나 같은 소수 중 가장작은 소수를 구하기... 소수 Prime
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[ n];

        for (int i = 0 ; i<n; i++){
            long N = Long.parseLong(br.readLine());
            if (N <= 2){ // 1일경우 2일경우 그냥 이렇게 출력하는게 낫다.
                System.out.println(2);
                continue;
            }

            // 여기가 핵심. 주어진 N이 소수가 아니면 false 반환 N++하며 소수를 찾는다.
            while(true){
                boolean flag = isPrime(N);

                if (flag) {
                    System.out.println(N);
                    break;
                }

                N++;
            }
        }

        br.close();
    }
    // 소수인지 판단하는 메소드
    public static boolean isPrime(long x){
        for (int i = 2; i <= Math.sqrt(x); i++){
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }
}
