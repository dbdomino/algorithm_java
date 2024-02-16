package com.ex.baekjoon.스택문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class ex12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] line = new int[n]; //승환이 앞에 서있는 학생들의 수만큼 순서 저장하는 배열
        for(int i = 0; i < n; i++) {
            line[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();

        int cnt =1;
        for (int i=0; i<n; i++){
            int a = line[i];
            if (a == cnt) cnt++;
            else {
                    //새로운 줄이이 비어있지 않을 때 가장 최근에 들어간 요소가 찾는 번호일 경우
                if(!stack.isEmpty() && stack.peek() == cnt){ // 이런경우도 생각해야 함. 꺼내면서도 순서지ㅕ야 하므로.
                    stack.pop();
                    i--; //배열공간이 아닌 stack에있던걸 꺼낸거라, 한번더 반복해야한다.
                    cnt++;
                }else{ //찾는 번호가 아닐 경우 임시저장소에 넣는다
                    stack.push(a);
                }
            }
        }

        int stacksize = stack.size();
        boolean flag = true;
        for (int i=0; i<stacksize; i++ ) {
            int a = stack.pop();

            if (a == cnt) cnt++;
            else {flag=false; break;}
        }
        String s;
        if (flag) s="Nice";
        else s = "Sad";

        System.out.println(s);

    }
}
