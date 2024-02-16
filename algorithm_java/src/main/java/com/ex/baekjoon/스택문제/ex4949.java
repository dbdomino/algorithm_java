package com.ex.baekjoon.스택문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class ex4949 {
    /*
문자열에 포함되는 괄호는 소괄호("()") 와 대괄호("[]")로 2종류이고, 문자열이 균형을 이루는 조건은 아래와 같다.

모든 왼쪽 소괄호("(")는 오른쪽 소괄호(")")와만 짝을 이뤄야 한다.
모든 왼쪽 대괄호("[")는 오른쪽 대괄호("]")와만 짝을 이뤄야 한다.
모든 오른쪽 괄호들은 자신과 짝을 이룰 수 있는 왼쪽 괄호가 존재한다.
모든 괄호들의 짝은 1:1 매칭만 가능하다. 즉, 괄호 하나가 둘 이상의 괄호와 짝지어지지 않는다.
짝을 이루는 두 괄호가 있을 때, 그 사이에 있는 문자열도 균형이 잡혀야 한다.

각 줄마다 해당 문자열이 균형을 이루고 있으면 "yes"를, 아니면 "no"를 출력한다.
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        StringBuffer sb = new StringBuffer();
        boolean a = true;
        while (a) {
            String str = br.readLine();
            if(".".equals(str)) break;

            if (check(str)) {
                sb.append("yes").append("\n");
            }else {
                sb.append("no").append("\n");
            }


        }
        System.out.println(sb);

        br.close();

    }

    private static boolean check(String str) {
        Stack<Character> stackA = new Stack<>();
//        Stack<String> stackB = new Stack<>();
        for(int i = 0; i< str.length(); i++) {
            char c = str.charAt(i);
            if ('('==c) stackA.push(c);
            else if ('['==c) stackA.push(c);
            else if (')' == c) {
                if(stackA.empty() || stackA.peek() != '(') {
                    return false;
                } else {
                    stackA.pop();
                }
            }
            else if (']' == c) {
                if(stackA.empty() || stackA.peek() != '[') {
                    return false;
                } else {
                    stackA.pop();
                }
            }

        }
        if (stackA.empty() ) {
            return true;
           } else {
            return false;
        }
    }
}
