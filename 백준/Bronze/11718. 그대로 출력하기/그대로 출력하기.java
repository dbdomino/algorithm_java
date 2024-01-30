import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 상수
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int count = 0;

        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < 100; i++) {
            s = br.readLine();
            if ("".equals(s) || null == s) break;
            
            sb.append(s+"\n");
        }
        System.out.print(sb);

        br.close();
    }
}

