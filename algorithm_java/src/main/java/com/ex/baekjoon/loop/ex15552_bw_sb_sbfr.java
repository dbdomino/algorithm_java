package com.ex.baekjoon.loop;

import java.io.*;
import java.util.StringTokenizer;

public class ex15552_bw_sb_sbfr {
    public static void main(String[] args) throws IOException {
//        OutputStream os = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // System.out이 아니라 파일이 될수도 있고,
//        BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(os)); // System.out이 아니라 파일이 될수도 있고,
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;

        int j = t;
        StringBuilder sb = new StringBuilder(); // 스트링빌더
        StringBuffer sbffr = new StringBuffer(); // 스트링버퍼
        while (j-- > 0){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a + b).append("\n");
            sbffr.append(a + b).append("\n");

        }
        System.out.println(sbffr); // 둘다 가능
        System.out.println(sb);

//        for (int i = 0; i < t; i++){
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//
//            bw.write(a + b + "\n"); // BufferedWriter에 값을 저장시켜 이후 flush로 한번에 출력시킨다.
//        }
        br.close(); // buffer 쓸대 필수.

        bw.flush();
        bw.close();
    }
}
