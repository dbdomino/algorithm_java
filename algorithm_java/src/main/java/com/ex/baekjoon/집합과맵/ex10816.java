package com.ex.baekjoon.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
// 카운팅 정렬 형식을 사용하여 풀 수도 있다만
        // 이분탐색으로 풀어보자
        // 일단, 이분 탐색의 경우 구간의 중간 위치의 값과 key(찾고자 하는 값)를 비교하여 구간을 절반으로 줄여나가며 풀이하는 것이다.
        //이분 탐색의 원리는 구간 내의 중앙 위치의 값을 기준으로 key 값과 비교를 한 뒤,
        // 상한선(hi)을 내릴 것인지, 하한선(lo)을 올릴 것인지를 결정하는 것이다.
        //
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

        }
        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < m; i++) {
            int key = Integer.parseInt(st.nextToken());

            // upperBound와 lowerBound의 차이 값을 구한다.
            // 바로 중복 원소의 왼쪽 끝 값과 오른쪽 끝 인덱스 값을 알아내는 것
            sb.append(upperBound(arr, key) - lowerBound(arr, key)).append(' ');
        }
        System.out.println(sb);
    }


    private static int lowerBound(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length;

        // lo가 hi랑 같아질 때 까지 반복
        while (lo < hi) {
            int mid = (lo + hi) / 2; // 중간위치를 구한다.

            /*
             *  key 값이 중간 위치의 값보다 작거나 같을 경우
             *  (중복 원소에 대해 왼쪽으로 탐색하도록 상계를 내린다.)
             */
            if (key <= arr[mid]) {
                hi = mid;
            }
            else {
                lo = mid + 1;
            }

        }

        return lo;
    }

    private static int upperBound(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length;

        // lo가 hi랑 같아질 때 까지 반복
        while (lo < hi) {

            int mid = (lo + hi) / 2; // 중간위치를 구한다.

            // key값이 중간 위치의 값보다 작을 경우
            if (key < arr[mid]) {
                hi = mid;
            }
            // 중복원소의 경우 else에서 처리된다.
            else {
                lo = mid + 1;
            }

        }

        return lo;
    }

    private static int upperBound2(int[] arr, int key) {
        int low=0;
        int high = arr.length;

        // 이분탐색이라는게 결국 low와 high를 비교해서 같아질때의 low값을 뱉는거네
        // 비교할때 중간값을 사용하는거고
        while(low < high) {
            int mid = (low + high) / 2; // 중간위치를 구한다.

            if( key <= arr[mid]) {    // 여기 공식이 핵심인데, 이건 문제에 따라 달라진다. 배열에서 위치를 찾는것.이 이분탐색의 목적
                // 중간위치가 index에 들어가는 이유는 인덱스 위치를 구하기 위해서다.
                // low와 high가 인덱스 위치에 들어가서 하는일이 key와 비교해서 조건에 맞는 low=high를 구하기 위해

                // 해당 조건에 맞다면
                high = mid;

            } else {
                // 해당 조건에 안맞다면 low +1 해가면서 low와 high 가 맞아떨어지는 위치를 찾는게 이분탐색, 공식
                low = low +1;
            }

        }

        return low;
    }
}
