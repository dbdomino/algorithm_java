package com.ex.baekjoon.큐문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

/**
 * 제일 처음에는 1번 풍선을 터뜨린다. 다음에는 풍선 안에 있는 종이를 꺼내어 그 종이에 적혀있는 값만큼 이동하여
 * 다음 풍선을 터뜨린다. 양수가 적혀 있을 경우에는 오른쪽으로, 음수가 적혀 있을 때는 왼쪽으로 이동한다.
 * 이동할 때에는 이미 터진 풍선은 빼고 이동한다.
 */
public class ex2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        Deque<int[]> queue=  new ArrayDeque<>(); // deque 생성하기
        StringBuilder sb = new StringBuilder();

        // 첫번째 값은 무조건 들어오고, 반드시 고정적으로 처리
        int Input = Integer.parseInt(st.nextToken());
        sb.append("1 ");

        // 두번째 값부터 저장된 deque 구현
        for (int i = 2; i <= n ; i++) {
            queue.offer(new int[]{i, Integer.parseInt(st.nextToken())});
        }
        // firstInput과 이후 input이 음수인지 양수인지에 따라 다르게 작동
        while (!queue.isEmpty()) {
            if (Input > 0) {
                for (int x = 1; x < Input; x++) {
                    queue.offer(queue.poll()); // offer 스택에 넣는다. 뭘? poll 우선순위 최강
                }

                int[] next = queue.poll();
                Input = next[1];
                sb.append(next[0]).append(" ");
            } else {
                for (int x = Input; x < -1; x++) {
                    queue.offerFirst(queue.pollLast());
                }

                int[] next = queue.removeLast();
                Input = next[1];
                sb.append(next[0]).append(" ");
            }
        }

        System.out.println(sb);


        br.close();
    }

}
