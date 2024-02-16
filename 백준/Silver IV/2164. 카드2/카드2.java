import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
// 차례로 1부터 N까지의 번호가 붙어 있으며, 1번 카드가 제일 위에, N번 카드가 제일 아래인 상태로 순서대로 카드가 놓여 있다.
// N=4인 경우를 생각해 보자. 카드는 제일 위에서부터 1234 의 순서로 놓여있다. 1을 버리면 234가 남는다. 여기서 2를 제일 아래로 옮기면 342가 된다. 3을 버리면 42가 되고, 4를 밑으로 옮기면 24가 된다. 마지막으로 2를 버리고 나면, 남는 카드는 4가 된다.
        Queue<Integer> queue = new ArrayDeque<>();
//        Deque<Integer> queue = new ArrayDeque<>(); // 큐와 스택 모든성격을 가진 것. 조심해서 써야한다.
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i<=n ; i++){
            queue.offer(i);
        }
//        System.out.println(queue);
//        System.out.println();
        while(queue.size() > 1){
            queue.poll();
            queue.offer(queue.poll());
//            System.out.println(queue);

        }
        System.out.println(queue.poll());


        br.close();

    }
}
