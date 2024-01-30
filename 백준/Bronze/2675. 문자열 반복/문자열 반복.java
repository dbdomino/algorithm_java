import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문자열 반복
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            String b = st.nextToken();

            int b_len = b.length();
            char[] b_char_arr = b.toCharArray();

            for(int j = 0; j<b_len; j++) {
                for(int k=0; k < a; k++){
//                    sb.append(b.charAt(j));
                    sb.append(b_char_arr[j]);
                }

            }


            sb.append("\n");

        }
        System.out.print(sb);


    }
}