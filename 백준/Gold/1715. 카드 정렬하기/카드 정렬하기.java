
import java.util.Scanner;
import java.util.PriorityQueue;

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
            int temp1 = pq.poll();
            int temp2 = pq.poll();

            answer += temp1 + temp2;
            pq.add(temp1 + temp2); //합한 묶음 다시 넣기
        }
        System.out.println(answer);


    }

}