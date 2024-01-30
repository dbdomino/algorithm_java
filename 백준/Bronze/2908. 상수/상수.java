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

        for (int i = 0; i<2; i++){
            char[] c_arr = b_arr[i].toCharArray();
            char temp = c_arr[0];
            c_arr[0] = c_arr[2];
            c_arr[2] = temp;

            num[i] = Integer.parseInt(new String(c_arr,0,3));
        }
        if (num[0] <num[1]) System.out.println(num[1]);
        else System.out.println(num[0]);
        br.close();
    }
}