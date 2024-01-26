
import java.util.Scanner;
import java.util.PriorityQueue;
// 그리디, priority 큐
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < n; i++){
            pq.add(sc.nextInt());
        }

        //우선순위 큐에 2개이상 들어있어야 비교가 가능하다.
        int answer = 0;
        while (pq.size() > 1) {
            int temp1 = pq.poll(); // .poll() socket / pipe 등에서 동시에 여러개의 I/O를 대기할 경우에 특정한 fd에 blocking되지 않고 I/O를 할 수 있는 상태인 지를 모니터링하여 I/O 가능한 상태의 fd인지를 검사하는 함수
            int temp2 = pq.poll(); // 꺼내기 이며 빈값을 꺼낼경우 null로 리턴

            answer += temp1 + temp2;
            pq.add(temp1 + temp2); //합한 묶음 다시 넣기
        }
        System.out.println(answer);
        // stack은 st.push("2"); 넣기 st.pop(); 꺼내기
        // quque는 q.offer("0"); 넣기 q.poll(); 꺼내기
        sc.close();

    }

}
