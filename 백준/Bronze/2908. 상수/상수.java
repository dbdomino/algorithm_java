import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 상수
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String b = br.readLine();
        String[] b_arr = b.split(" ");
        int[] num = new int[2];

        StringTokenizer st = new StringTokenizer(b);

        for (int i = 0; i<2; i++){
            b_arr[i] = new StringBuffer(b_arr[i]).reverse().toString();
            num[i] = Integer.parseInt(b_arr[i]);
        }

        if (num[0] <num[1]) System.out.println(num[1]);
        else System.out.println(num[0]);
        br.close();
    }
}