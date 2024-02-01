package com.ex.baekjoon.심화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();

        int count = 0;
        int len = s.length();

        // 	런타임 에러 (StringIndexOutOfBounds) 발생,
        // 인덱스 외까지 검색조건에 돌린다는 소린데, c 나 z 같은걸로 끝나면 이래된다는 소리.
        // 즉 ć 와 c 도 각각 별개로 셀 수 있어야 한다는 소리다. 처음과 중간은 이게 되지만, 마지막에서 검색시 에러발생.

        // 이를 위해 && i<len -1 추가
/*
        for (int i = 0; i < len; i++) {

            char ch = s.charAt(i);

            if(ch == 'c' && i<len -1) {			// 만약 ch 가 c 라면?
                if(s.charAt(i + 1) == '=') {		//만약 ch 다음 문자가 '=' 이라면?
                    // i+1 까지가 하나의 문자이므로 다음 문자를 건너 뛰기 위해 1 증가
                    i++;
                }
                else if(s.charAt(i + 1) == '-') {
                    i++;
                }
            }

            else if(ch == 'd' && i<len -1) {
                if(s.charAt(i + 1) == 'z' && i<len -2) {
                    if(s.charAt(i + 2) == '=') {	// dz= 일 경우
                        i += 2;
                    }
                }

                else if(s.charAt(i + 1) == '-') {	// d- 일 경우
                    i++;
                }
            }

            else if(ch == 'l' && i<len -1) {
                if(s.charAt(i + 1) == 'j') {	// lj 일 경우
                    i++;
                }
            }

            else if(ch == 'n' && i<len -1) {
                if(s.charAt(i + 1) == 'j') {	// nj 일 경우
                    i++;
                }
            }

            else if(ch == 's' && i<len -1) {
                if(s.charAt(i + 1) == '=') {	// s= 일 경우
                    i++;
                }
            }

            else if(ch == 'z' && i<len -1) {
                if(s.charAt(i + 1) == '=') {	// z= 일 경우
                    i++;
                }
            }

            count++;

        }
        */

        String pattern = "c=|c-|dz=|d-|lj|nj|s=|z=";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);
        while (matcher.find()) {
            s = s.replaceFirst(matcher.group(), "*"); // 정규식에 맞는게 발견된다면 *로 바꿈
        }
        count = s.length();

        System.out.println(count);

    }
}
