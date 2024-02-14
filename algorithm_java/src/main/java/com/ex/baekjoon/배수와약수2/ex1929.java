package com.ex.baekjoon.배수와약수2;

import java.util.Scanner;

public class ex1929 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        //  에라토스테네스의 체  배열 만들어서 소수가 아닌것을 배열에 구분한 후 처리하는 방식
        //
        boolean[] arr = new boolean[m + 1];
        StringBuilder sb = new StringBuilder();
        //0과 1은 소수가 아니다.
        arr[0] = true;
        arr[1] = true;
        // 제곱해서 m을 넘지 않을때까지만 소수의 배수를 제외해 주면 된다.
        for(int i = 2; i * i <= m; i++) {

            if(arr[i]) continue; // false 이면 for 수행 true이면 소수가 아니므로 건너띔
                //j에는 소수의 배수들이 들어와서 true(소수가 아닌걸로 체크하기위함)
            for(int j = i * i; j <= m; j += i) { // i제곱, i제곱에 i를 더한것들은 모두 소수가 아니므로 true처리
                // 소수가 아니어서 true로 잡음
                arr[j] = true;
//                System.out.println(j);
            }
//            System.out.println();
            // false로 남은건 소수들이다.
        }

        for(int i = n; i <= m; i++) {
            // false = 소수
            if(!arr[i]) sb.append(i).append('\n');
        }
//        System.out.print(sb);


    }

    private static boolean isPrime(int a) {
        if (a == 1) return false;
        for (int i=2; i<= Math.sqrt(a); i++){
            if (a % i == 0){ // 소수인지 판단하는
                return false;
            }
        }

        return true;
    }

}
