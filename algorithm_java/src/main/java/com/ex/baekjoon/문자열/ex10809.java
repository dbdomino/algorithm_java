package com.ex.baekjoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
class Calculator<T> {
    void add(T a, T b) {}
    void min(T a, T b) {}
    void mul(T a, T b) {}
    void div(T a, T b) {}
}

class Main {
    public static void main(String[] args) {
        // 제네릭에 아무 타입이나 모두 할당이 가능
        Calculator<Number> cal1 = new Calculator<>();
        Calculator<Object> cal2 = new Calculator<>();
        Calculator<String> cal3 = new Calculator<>();
        Calculator<Main> cal4 = new Calculator<>();
    }
}

public class ex10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        // 각 단어의 처음 등장하는 위치가 저장되어야 한다. 그래야 비교가능

        int length = str.length();
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[26];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1; //결과 배열 초기화
        }

        for(int i = 0; i < length; i++) {
            char ch = str.charAt(i);

            if(arr[ch - 'a'] == -1) {	// ch위치에서 arr원소값이 -1 인 경우 = 아직 한번도 등록된적 없는 경우, 젤 처음나타난 위치 이므로 초기화
                arr[ch - 'a'] = i;
            }
        }

        for(int i = 0; i < 26; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.print(sb);
        br.close();
    }
}
