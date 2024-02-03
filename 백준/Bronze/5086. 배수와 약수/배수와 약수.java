import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();
        while (true){
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0 ) break;

            // 첫 번째 수가 두 번째 수의 약수일 때 (= 두 번째 수가 첫 번째 수의 배수일 때)
            if (b % a == 0 ) sb.append("factor").append("\n");
            // 첫 번째 수가 두 번째 수의 배수일 때 (= 두 번째 수가 첫 번째 수의 약수일 때)
            else if (a % b == 0 ) sb.append("multiple").append("\n");
            else sb.append("neither").append("\n");

            st= new StringTokenizer(br.readLine());

        }
        System.out.println(sb);
    }
}
