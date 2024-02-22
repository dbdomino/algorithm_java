import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long min = Long.parseLong(st.nextToken());
        long max = Long.parseLong(st.nextToken());

        long size = max-min + 1;

        boolean[] checkArr = new boolean[(int)size];
        long i = 2;
        while (i * i <= max) {
            long value = i * i;
            int remain = 0;
            if (min % value != 0) {
                remain = 1;
            }

            long data = (min / value) + remain; // 몫을 가지고 제곱수와 곱해서 비교처리
            while (value * data <= max) {
                if (!checkArr[(int)(value * data - min)]) {
                    checkArr[(int)(value * data - min)] = true;
                    size -= 1;
                }
                data += 1;
            }

            i += 1;
        }
        System.out.println(size);

        br.close();
    }
}