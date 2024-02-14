import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여는 괄호 '(' 가 있으면 반드시 이에 대응하는 닫는 괄호 ')' 가 있어야한다는 것이다.
        // 그럼 이를 스택에 어떻게 활용할 수 있을까?
        // . 여는 괄호가 있을 때는 스택에 쌓고 닫는 괄호가 있으면 여는 괄호를 하나 지우면(pop) 된다.
        // 중요한점은 (가 충분히 없는데 )가 먼저나오면 안된다는 점이다. 핵심.
        // 이때문에 stack을 쓰네
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuffer sb= new StringBuffer();
        for (int i = 0; i<n; i++) {
            String str = br.readLine();

            sb.append(method(str)).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
    private static String method (String str) {
        Stack<Character> stack = new Stack<>();
        for(int j=0; j<str.length(); j++){
            char c = str.charAt(j);
            if (c == '(') stack.push(c);
            else if (stack.isEmpty()) { // ')' 가 들어왔을 때 stack이 빈상태라면 No
                return "NO";
            } else {
                stack.pop();
            }
        }
        if (stack.isEmpty()) return "YES";
        else return "NO"; // 비어있지않으면 '(' 가 더 많다는 것.
    }
}
