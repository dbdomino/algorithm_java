package com.ex.baekjoon.배수와약수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex1735 {
    public static void main(String[] args) throws IOException {
        // 두 분수의 합 또한 분수로 표현할 수 있다. 두 분수가 주어졌을 때, 그 합을 기약분수의 형태로 구하는 프로그램을
// 작성하시오. 기약분수란 더 이상 약분되지 않는 분수를 의미한다.
        // 약분?? 나눠 떨어지는 것.
        // a1/b1 과 a2/be 분수 두개의 합을 기약분수로 구하라
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int b1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int a2 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());

        int resultA = (a1*b2 + a2*b1) ;
        int resultB = (b1*b2) ;

        int r = gcd(resultA, resultB);
//        int r = gcd(b1, b2);


        System.out.print(resultA/ r + " " + resultB/ r);

        br.close();

    }
    static public int gcd(int a, int b) {
        while (b > 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;

    }

    public static int getGcd(int a, int b) {
        if(a%b==0) {
            return b;
        }
        return getGcd(b, a%b);
    }
}
