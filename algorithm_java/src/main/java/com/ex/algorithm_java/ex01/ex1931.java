package com.ex.algorithm_java.ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


// 회의실 정하기, 시간표를 최대한 많이 배정가능한 개수를 찾는 것
// '활동 선택 문제(Activity Selection problem)'
// 한 회의실을 사용할 수 있는 회의의 최대 개수
public class ex1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int cnt = 0;

        int[][] arr = new int[n][2];// 값을 비교해야 하므로 한번 선언은 다해야함..
        for (int i = 0 ; i < n ; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());	// 시작시간
            arr[i][1] = Integer.parseInt(st.nextToken());	// 종료시간

        }

        // 문제의 핵심인 정렬, 어떤 자료를 기준으로 정렬할 것인가?
        // 하나의 회의실의 최대 사용횟수를 구하는 것, 끝나는 시간 기준으로 정렬 필요
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) { // 끝나는 시간 같을때 시작시간 기준으로 정렬
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];

            }
        });

        int prev_end_time = 0;
        // 정렬시킨 배열을 하나씩 모두 비교하여 최대값 찾기
        for(int i = 0; i < n; i++) {
            // 직전 종료시간이 다음 회의 시작 시간보다 작거나 같다면
            if(prev_end_time <= arr[i][0]) {
                prev_end_time = arr[i][1];
                cnt++;
            }
        }
        System.out.println(cnt);

        br.close();
    }
}
