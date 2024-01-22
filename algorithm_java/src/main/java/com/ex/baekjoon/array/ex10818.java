package com.ex.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class ex10818 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        br.close();


//        StringTokenizer st = new StringTokenizer(str);
//        int[] nArr = new int[n];
//        for (int i = 0; i < n; i++){
//            nArr[i] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(nArr);
//        System.out.println(nArr[0]+" "+nArr[n-1]);
//

        String[] stArr = str.split(" ");
////        int[] nArr0 = Stream.of(stArr).mapToInt(Integer::parseInt).toArray();
////        int[] nArr = Arrays.stream(stArr).mapToInt(Integer::parseInt).toArray();
        int max = Arrays.stream(stArr).mapToInt(Integer::parseInt).max().getAsInt();
        int min = Arrays.stream(stArr).mapToInt(Integer::parseInt).min().getAsInt();

        System.out.println(min + " " + max);


    }

}
