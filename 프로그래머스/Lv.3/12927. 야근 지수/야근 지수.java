import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public long solution(int n, int[] works) {
        
        // 큐의 구조 FIFO(First In First Out)를 가지면서, 데이터가 들어온 순서대로 데이터가 나가는 것이 아닌
        // 우선순위를 먼저 결정하고 그 우선순위가 높은 데이터가 먼저 나가는 자료구조이다.
        PriorityQueue<Integer> overtime = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < works.length; i++) {
            overtime.offer(works[i]); // Queue에 객체를 저장. 성공하면 true, 실패하면 false 반환
        }

        // 이때 n시간을 모두 첫 번째 일을 처리하는데 사용하면 남는 시간은 0, 3, 3이 될 것이고 야근 지수는 18이 된다
        //그러나 전체적으로 균형있게 줄여 2, 2, 2로 만들면 야근지수는 12가 되고 이는 최소값이 된다.
        // 이를위해 PriorityQueue 를 써서 큐의 최대값을 poll 해오도록 하는 것이다.
        while(n > 0) {
            int work = (int) overtime.poll(); // Queue에 객체를 꺼내 반환, 비어있으면 null 반환
            // System.out.println("n : "+n+", work : "+work);
            if(work == 0) break; //더 이상 줄일 수 있는 일이 없음.
            work -= 1; //일 한시간 줄인다.
            overtime.offer(work);
            n -= 1; // 남은 작업 시간 한시간 줄인다.
        }
        long answer = 0; // 야근 피로도 = 야근을 시작한 시점에서 남은 일의 작업량^2
        for(int work : overtime) {
//            System.out.println("else work : "+work);
            answer += work * work;
        }


        return answer;
    }
}