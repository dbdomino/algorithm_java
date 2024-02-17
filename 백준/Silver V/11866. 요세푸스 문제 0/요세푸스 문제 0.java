import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 요세푸스 순열   (N, K)-
        /*
        * 1 2 3 4 5 6 7
        *
        * */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for (int i =0; i<n; i++) {
            queue.offer(i+1);
        }

        StringBuffer sb = new StringBuffer();
        sb.append("<");
        for (int i=0; i < n; i++) {
            for (int j=0; j< k-1; j++){
                queue.offer(queue.poll());
            }
            sb.append(queue.poll());

            if (i != n-1) sb.append(", ");
        }
        sb.append(">");
        sc.close();

        System.out.println(sb);

    }
}