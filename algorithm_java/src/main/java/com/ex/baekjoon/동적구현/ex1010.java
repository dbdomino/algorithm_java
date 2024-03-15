package com.ex.baekjoon.동적구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex1010 {
    /** 경우의 수 구하기 다리
     * n, m
     * m! / n! * (m-n)!
     */

    static int[][] dp = new int[30][30];	// 0 ~ 29

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < a; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            //mCn
            sb.append(mCn(m,n)).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
    static private int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n* factorial(n-1);
    }
    static private int mCn(int m, int n) {
        /*long result =1;// 0과 1 팩토리얼은 1로 출력하려고
        for (long i = (m - n) + 1; i <= m; i++) {
            result *= i;
        }

        for (long i = 1; i <= n; i++) {
            result /= i;
        }*/
        // 알고리즘은 맞는데, 이런식으로 하게 되면 overflow문제가 발생한다. 20!만으로도 64비트 정수형의 범위를 넘어가게 됨.
        // mCn 경우의수 위처럼 바로 계산은 불가하여, 조합의 성질을 이용해서 변형해서 푼다.
        // 1. m+1Cn+1 = (mCn) + (mCn+1)
        // 2. mC0 = mCm = 1    // 경우의 수 조합 성질


        // 이미 탐색했던 경우 바로 반환
        if(dp[m][n] > 0) {
            return dp[m][n];
        }

        // 2번 성질 mC0 = mCm = 1
        if(m == n || n == 0) {
            return dp[m][n] = 1;
        }
        // 1번 성질 m+1Cn+1 = (mCn) + (mCn+1)  => mCn = (m-1Cn-1) +(m-1Cn);
        return dp[m][n] = mCn(m - 1, n - 1) + mCn(m - 1, n);
    }
}
