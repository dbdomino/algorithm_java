package com.ex.baekjoon.심화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        int n1 = 0;
        int n2 = a.length()-1;
        int result = 1;
        while (n1 < n2) {
            if (a.charAt(n1) != a.charAt(n2)) { result = 0; break; }
            n1++; n2--;
        }
        System.out.print(result);

    }
}
