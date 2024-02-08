package com.ex.baekjoon.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex2798_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i =0; i<n ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int sum = 0;
        int tmp = 0;

        for (int i=0; i<n-2; i++){
            for(int j = i+1; j<n; j++) {
                for (int k=j+1; k<n; k++ ){
                    if ( (arr[i]+arr[j]+arr[k]) <= m) { // 합계가 m보다 작고
                        tmp = arr[i]+arr[j]+arr[k]; // tmp값 저장시켜 이후 비교
//                        tmp = Math.min(tmp,arr[i]+arr[j]+arr[k]);
                        if(sum <= tmp) // sum값과 tmp값 중 큰값이 m에 더 가까울 것이다.
                            sum = tmp ;
                    }

                }
            }
        }
        System.out.println(sum);

        br.close();

    }
}
