import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * The type Ex 28278.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        // 시간초과 해결하기위해 사용
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stackA = new Stack<>();
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b =0;
            if (a == 1) {b = Integer.parseInt(st.nextToken()); }


            switch (a) {
                case 1: // 1 X: 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000)
                    stackA.push(b);
                    break;
                case 2: // 2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
                    sb.append(stackA.isEmpty()?-1:stackA.pop()).append("\n");
                    break;
                case 3: // 3: 스택에 들어있는 정수의 개수를 출력한다.
                    sb.append(stackA.size()).append("\n");
                    break;
                case 4: // 4: 스택이 비어있으면 1, 아니면 0을 출력한다.
                    sb.append(stackA.isEmpty()?1:0 ).append("\n");
                    break;
                case 5: // 5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
                    sb.append(stackA.isEmpty()?-1:stackA.lastElement()).append("\n");
                    break;

            }

        }
        System.out.print(sb);

        br.close();

    }

}