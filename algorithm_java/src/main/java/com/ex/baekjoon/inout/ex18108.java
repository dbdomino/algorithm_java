package com.ex.baekjoon.inout;

import java.io.*;

// 1998년생인 내가 태국에서는 2541년생?!
public class ex18108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int a = br.read(); // 2045 입력시 50만 나온다,
//        System.out.println(a);
        int a = br.read(); // 2045 입력시 2045 나온다.
        String b = br.readLine(); // 2045 입력시 2045 나온다.
        int must = 2541-1998;
        System.out.println(Integer.parseInt(b)-must);
    }
}
