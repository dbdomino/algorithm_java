
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
//        int[] a = new int[n];

        st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer(n);
        for (int i=0; i < n; i++) {
            int aa = Integer.parseInt(st.nextToken());
            if (aa < x) sb.append(aa).append(" ");
        }
        br.close();
        System.out.println(sb.toString());

    }
}
