import java.util.*;
class Solution {
    public int[] solution(int n, int[][] roads, int[] sources, int destination) {
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