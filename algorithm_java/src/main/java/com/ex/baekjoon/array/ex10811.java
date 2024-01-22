package com.ex.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class ex10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] nArr = new int[n];
        for (int i=0; i < n; i++) {
            nArr[i] = i+1;
        }
        int tmp;

        for (int i=0; i < m; i++) {
            st= new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken())-1; // 순서 인덱스로 받음
            int b = Integer.parseInt(st.nextToken())-1;
            while(a < b){ // 배열의 a 부터 b까지 역순정렬
                tmp = nArr[a];
                nArr[a] = nArr[b];
                nArr[b] = tmp;
                a++;b--;
            }
        }
        System.out.println(Arrays.toString(nArr));
        StringBuilder sb2 = new StringBuilder();
//        Stream.of(nArr).forEach( (a)-> { sb2.append(Arrays.toString(a)).append(" "); }); // 배열 자체를 하나의 스트림에 넣는것
        Arrays.stream(nArr).forEach( (a)-> { sb2.append(a).append(" "); });
//        Stream.of(nArr).map(a -> String.valueOf(a)).forEach( (b)-> {sb.append(b).append(" ");});
//        for (int i = 0; i < n; i++) {
//            sb.append(nArr[i]).append(" ");
//        }

//        Arrays.sort(nArr, Collections.reverseOrder()); // nArr가 Integer로 wrapping되어야 한다.
//        nArr.sort(Collections.reverseOrder());
        br.close();

        System.out.print(sb2);
    }
}
