package com.ex.baekjoon.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class ex1427 {
    public static void main(String[] args) throws IOException {
        // 첫째 줄에 정렬하려고 하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        char[] arr = n.toCharArray();
        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }

/*  카운팅정렬      int[] counting = new int[10];
        int c;
        while((c = in.read()) != '\n') {
            counting[c - '0']++;
        }

        for (int i = 9; i >= 0; i--) {
            while (counting[i]-- > 0) {
                System.out.print(i);
            }
        }*/

        br.close();

    }
}
