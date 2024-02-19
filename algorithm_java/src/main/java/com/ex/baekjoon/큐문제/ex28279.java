package com.ex.baekjoon.큐문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class ex28279 {
    public static void main(String[] args) throws IOException {
/*
1 X: 정수 X를 덱의 앞에 넣는다. (1 ≤ X ≤ 100,000)
2 X: 정수 X를 덱의 뒤에 넣는다. (1 ≤ X ≤ 100,000)
3: 덱에 정수가 있다면 맨 앞의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
4: 덱에 정수가 있다면 맨 뒤의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
5: 덱에 들어있는 정수의 개수를 출력한다.
6: 덱이 비어있으면 1, 아니면 0을 출력한다.
7: 덱에 정수가 있다면 맨 앞의 정수를 출력한다. 없다면 -1을 대신 출력한다.
8: 덱에 정수가 있다면 맨 뒤의 정수를 출력한다. 없다면 -1을 대신 출력한다.
 */
        Deque<Integer> deque = new LinkedList<>();
// 1. push: 스택에서 가장 위에 element를 추가합니다.
// 2. pop: stack에 가장 위에 있는 element를 제거합니다.
// 3. Peek는 스택에 가장 위 element를 반환하는 함수입니다.

// 1. offer 또는 add: 큐에 값을 넣습니다.
// 2. poll: 큐에 값을 빼냅니다.
// 3. peek: 큐에 값을 빼내지않고 제일우선순위 높은값을 반환합니다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st ;
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a= Integer.parseInt(st.nextToken());
            int b=0;

            switch (a){
                case 1:
                    b = Integer.parseInt(st.nextToken());
                    deque.offerFirst(b);
                    break;
                case 2:
                    deque.offerLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    if (deque.isEmpty()) b = -1;
                    else b = deque.poll();
                    sb.append(b).append("\n");
                    break;
                case 4:
                    if (deque.isEmpty()) b = -1;
                    else b = deque.pollLast();
                    sb.append(b).append("\n");
                    break;
                case 5:
                    b = deque.size();
                    sb.append(b).append("\n");
                    break;
                case 6:
                    if (deque.isEmpty()) b = 1;
                    else b = 0;
                    sb.append(b).append("\n");
                    break;
                case 7:
                    if (deque.isEmpty()) b = -1;
                    else b = deque.peek();
                    sb.append(b).append("\n");
                    break;
                case 8:
                    if (deque.isEmpty()) b = -1;
                    else b = deque.peekLast();
                    sb.append(b).append("\n");
                    break;
            }
        }
        System.out.print(sb);
        br.close();
    }
}
