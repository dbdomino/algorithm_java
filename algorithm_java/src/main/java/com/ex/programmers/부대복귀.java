package com.ex.programmers;

import java.util.*;

public class 부대복귀 {
    public static void main(String[] args) {
        int[][] roads = {{1, 2}, {2, 3}};
        int[] sources = {2,3};
        int destination = 1;
        System.out.println(Arrays.toString(solution(3, roads, sources,destination)));
    }

    /**
     * 강철부대의 각 부대원이 여러 지역에 뿔뿔이 흩어져 특수 임무를 수행 중입니다.
     * 지도에서 강철부대가 위치한 지역을 포함한 각 지역은 유일한 번호로 구분되며, 두 지역 간의 길을 통과하는 데
     * 걸리는 시간은 모두 1로 동일합니다. 오호
     * 임무를 수행한 각 부대원은 지도 정보를 이용하여 최단시간에 부대로 복귀하고자 합니다.
     * 다만 적군의 방해로 인해, 임무의 시작 때와 다르게 되돌아오는 경로가 없어져 복귀가 불가능한 부대원도 있을 수 있습니다.
     * n 길정보 노드수
     * road 움직힐 수 있는 경로
     * sources 부대원이 위치한 노드
     * destination 목적지, 여기로 와야함.
     * result, source기준 도착할 수 있는 시간 배열로 출력 갈 수 있는 경로 없으면 -1출력
     */
    public static int[] solution(int n, int[][] roads, int[] sources, int destination) {
        List<Integer>[] roadList;
        int[] d;

        int[] answer = new int[sources.length];
        roadList = new List[n+1];
        d = new int[n+1];
        // 우선순위 큐, 숫자가 들어오는 정렬 기준을 선정하여 배열을 순서에 따라 저장
        Queue<int[]> pq = new PriorityQueue<>((o1, o2) -> Integer.compare(o1[1], o2[1]));

        for (int i = 0; i <= n; i++) {
            roadList[i] = new ArrayList<>();
            d[i] = Integer.MAX_VALUE;
        }

        for (int[] road : roads) {
            roadList[road[0]].add(road[1]);
            roadList[road[1]].add(road[0]);
        }

        d[destination] = 0;
        pq.add(new int[]{destination, 0});

        while(!pq.isEmpty()) {
            int[] x = pq.poll();

            if(d[x[0]] < x[1]) continue;

            for (Integer next : roadList[x[0]]) {
                if(d[next] > (d[x[0]] + 1)) {
                    pq.add(new int[]{next, d[x[0]] + 1});
                    d[next] = d[x[0]] + 1;
                }
            }
        }

        for (int i = 0; i < sources.length; i++) {
            if(d[sources[i]] == Integer.MAX_VALUE) {
                answer[i] = -1;
                continue;
            }
            answer[i] = d[sources[i]];
        }

        return answer;
    }
}
