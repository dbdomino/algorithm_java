package com.ex.baekjoon.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 정렬 10814 나이순 정렬
public class ex10814 {
    public static void main(String[] args) throws IOException {
        // 첫째 줄에 온라인 저지 회원의 수 N이 주어진다. (1 ≤ N ≤ 100,000)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        String[][] sarr = new String[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            // 해당 인덱스의 값을 1 증가
            sarr[i][0] = st.nextToken();
            sarr[i][1] = st.nextToken();
        }
        br.close();

        Arrays.sort(sarr, (e1, e2) -> {
            return Integer.parseInt(e1[0]) - Integer.parseInt(e2[0]); // e1 e2의 첫번째 인자로 비교, 두번째인자는 입력받은 순이니 이미 정렬되어있음.
        });

//        Arrays.sort(sarr, new Comparator<String[]>() {
//            // 나이순으로 정렬
//            @Override
//            public int compare(String[] s1, String[] s2) {
//                return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
//            }
//
//        });

        for(int i = 0; i < n; i++) {
            System.out.println(sarr[i][0] + " " + sarr[i][1]);
        }

    }
}
