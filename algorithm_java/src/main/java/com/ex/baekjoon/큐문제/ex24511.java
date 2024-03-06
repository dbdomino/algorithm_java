package com.ex.baekjoon.큐문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

/**
 * 한가롭게 방학에 놀고 있던 도현이는 갑자기 재밌는 자료구조를 생각해냈다. 그 자료구조의 이름은 queuestack이다.
 * queuestack의 구조는 다음과 같다.
 * $1$번,
 * $2$번, ... ,
 * $N$번의 자료구조(queue 혹은 stack)가 나열되어있으며, 각각의 자료구조에는 한 개의 원소가 들어있다.
 * queuestack의 작동은 다음과 같다.
 * 길이 M의 수열 C를 가져와서 수열의 원소를 앞에서부터 차례대로 queuestack에 삽입할 것이다.
 * 이전에 삽입한 결과는 남아 있다.
 *
 * 입력
 * 첫째 줄에 queuestack을 구성하는 자료구조의 개수 $N$이 주어진다. (
 * $1 \leq N \leq 100\,000$)
 *
 * 둘째 줄에 길이 N의 수열A가 주어진다.
 * $i$번 자료구조가 큐라면$A_i = 0
 * 스택이라면 $A_i = 1 이다.
 *
 * 셋째 줄에 길이N의 수열B가 주어진다.
 * $B_i$는
 * $i$번 자료구조에 들어 있는 원소이다. (
 * long
 *
 * 넷째 줄에 삽입할 수열C의 길이M이 주어진다.
 * $1 \leq M \leq 100\,000$)
 *
 * 다섯째 줄에 queuestack에 삽입할 원소를 담고 있는 길이M의 수열C가 주어진다. (
 * long
 *
 * 입력받은 수 x0을 1번 자료구조에 삽입한다.
 * 1번 자료구조에서 원소를 pop한다. 이 때 자료구조가 스택인지 큐인지에 따라 pop되는 원소가 다를 것이다.
 * pop된 원소를 x1이라고 하고 위의 과정을 2번 자료구조에 대해 실행한다.
 * xn이 구해질 때까지 반복하고 마지막에 xn을 리턴한다.
 *
 *
 * 수열 C의 원소를 차례대로 queuestack에 삽입했을 때의 리턴값을 공백으로 구분하여 출력한다.
 */

public class ex24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st ;

        int[] arr = new int[n];
        Deque<Integer> queue = new ArrayDeque<>();
        StringBuffer sb = new StringBuffer();

        // 수열A arr[i][0] = 0이면 큐, 1이면 스택
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 수열B $i$번 자료구조에 들어 있는 원소이다.
        // 스택에 대해선 신경쓸 필요가 없으므로 큐 자료구조인 것만 저장
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (arr[i] == 0) queue.offer(num);
            System.out.println(queue.toString());
        }

        // 수열 C의 길이M
        int m = Integer.parseInt(br.readLine());
        // queuestack에 삽입될 수열 C의 값, C는 삽입할 수열
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++) {
            queue.addFirst(Integer.parseInt(st.nextToken()));// 핵심. 이건 문제가 아니라 예제 입력 예시보고 나온 것.
            sb.append(queue.pollLast()).append(" "); // 결과론 적이다 너무...
        }
        System.out.println(sb);
        br.close();
    }
}
