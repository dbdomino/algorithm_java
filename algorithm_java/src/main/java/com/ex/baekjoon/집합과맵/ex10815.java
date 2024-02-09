package com.ex.baekjoon.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class ex10815 {
    public static void main(String[] args) throws IOException {
        // 숫자 카드는 정수 하나가 적혀져 있는 카드이다. 상근이는 숫자 카드 N개를 가지고 있다.
        // 정수 M개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 상근이가 가지고 있는지 아닌지를 구하는 프로그램을 작성하시오.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());


        int[] arr = new int[n];
        HashMap<String, Integer> owned = new HashMap<>();

        for (int i = 0; i<n; i++) {
            owned.put(st.nextToken(),0);
//            arr[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
//        int[] arr2 = new int[m];

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i<m; i++) {
            String tmp = st.nextToken();
//            System.out.println(owned.get(tmp));
            if (owned.get(tmp) != null) { // hashmap 의 get은 값이 없으면 null, 있으면 value를 반환한다....
                sb.append("1 ");
            }
            else {
                sb.append("0 ");
            }
//            arr2[i] = Integer.parseInt(st.nextToken());

        }

//
//        for (int i = 0; i<m; i++) {
//            if (Arrays.binarySearch(arr,arr2[i]) < 0 ) sb.append("0 ");
//            else sb.append("1 ");
//
//        }
        System.out.println(sb);


        br.close();
    }
}
