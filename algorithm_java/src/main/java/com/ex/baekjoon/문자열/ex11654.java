package com.ex.baekjoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println((int)str.charAt(0)); // char 형으로 뱉은걸 int로 형변환

        br.close();
    }
}
