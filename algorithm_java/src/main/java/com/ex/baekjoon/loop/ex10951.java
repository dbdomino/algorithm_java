package com.ex.baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ex10951 {
    public static void main(String[] args) throws IOException {
        //이 문제에서 가장 중요한 점이 파일 종료 조건이 없이 그냥 입력이 주어졌다는 것이다.
        //즉 입력에서 더이상의 읽을 수 있는 데이터가 존재하지 않을 때 반복문을 종료하라는 것이다.
        /*
        Scanner in=new Scanner(System.in);
        while(in.hasNextInt()){
            int a=in.nextInt();
            int b=in.nextInt();
            System.out.println(a+b);
        }
        in.close();
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;
        try {
            while ((str = br.readLine()) != null) {

                st = new StringTokenizer(str, " ");
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                sb.append(a + b).append("\n");

            }
        }catch (Exception e) {

        } finally {
            System.out.print(sb);
        }

    }
}
