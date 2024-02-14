package com.ex.baekjoon.스택문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Stack;

public class ex10773 {
    public static void main(String[] args) throws IOException {
        //  항상 정신없는 재현이는 돈을 실수로 잘못 부르는 사고를 치기 일쑤였다.
        //  잘못된 수를 부를 때마다 0을 외쳐서, 가장 최근에 재민이가 쓴 수를 지우게 시킨다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<n; i++ ){
            int a = Integer.parseInt(br.readLine());
            if (a ==0) stack.pop();
            else stack.push(a);
        }

        int sum = 0;
        for(int o : stack) {	// 스택에 담긴 원소 합 구하기
            sum += o;
        }

        System.out.println(sum);

        br.close();
    }
}
