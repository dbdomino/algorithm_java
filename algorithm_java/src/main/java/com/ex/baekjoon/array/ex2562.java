package com.ex.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int n = Integer.parseInt(s);
        int max = 0;
        int maxcnt = 0;
        int cnt = 0;
        do {
            cnt++;
            n = Integer.parseInt(s);
            if (n > max) { max = n; maxcnt = cnt;}
            s = br.readLine();

        } while ( cnt < 9);
        System.out.println(max);
        System.out.println(maxcnt);

        br.close();

    }
}
