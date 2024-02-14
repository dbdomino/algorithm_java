package com.ex.baekjoon.스택문제;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * The type Ex 28278.
 */
public class ex28278 {
    /**
     * The entry point of application.
     * 1 X: 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000)
     * 2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
     * 3: 스택에 들어있는 정수의 개수를 출력한다.
     * 4: 스택이 비어있으면 1, 아니면 0을 출력한다.
     * 5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
     * 첫째 줄에 명령의 수 N이 주어진다. (1 ≤ N ≤ 1,000,000)
     * 둘째 줄부터 N개 줄에 명령이 하나씩 주어진다.
     */
//    private static Stack<Integer> stackA = new Stack<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        // 시간초과 해결하기위해 사용
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stackA = new Stack<>();
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b =0;
            if (a == 1) {b = Integer.parseInt(st.nextToken()); }

            switch (a) {
                case 1: // 1 X: 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000)
                    stackA.push(b);
                    break;
                case 2: // 2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
                    sb.append(stackA.isEmpty()?-1:stackA.pop()).append("\n");
//                    System.out.println(stackA.isEmpty()?-1:stackA.pop()); // 맨위 정수 빼고 출력 , 비엇다면 -1 뱉음
//                    System.out.println(stackA.isEmpty()?-1:stackA.peek()); // 맨위 정수 빼지않고 출력, 비었다면 에러뱉음
//                    bw.write(stackA.isEmpty()?-1:stackA.pop() );
//                    bw.write("\n\r");
                    break;
                case 3: // 3: 스택에 들어있는 정수의 개수를 출력한다.
                    sb.append(stackA.size()).append("\n");
//                    System.out.println(stackA.size());
//                    bw.write(stackA.size());
//                    bw.write("\n\r");
                    break;
                case 4: // 4: 스택이 비어있으면 1, 아니면 0을 출력한다.
                    sb.append(stackA.isEmpty()?1:0 ).append("\n");
//                    System.out.println( stackA.isEmpty()?1:0 );
//                    bw.write( stackA.isEmpty()?1:0);
//                    bw.write("\n\r");
                    break;
                case 5: // 5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
                    sb.append(stackA.isEmpty()?-1:stackA.lastElement()).append("\n");
//                    System.out.println(stackA.isEmpty()?-1:stackA.lastElement()); // 맨위 정수 빼지않고 출력, 비엇다면 -1 뱉음.
//                    bw.write( stackA.isEmpty()?-1:stackA.lastElement() );
//                    bw.write("\n\r");
                    break;

            }

        }
        System.out.print(sb);

        br.close();

    }

}
