import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        final HashMap<String, Integer> map = new HashMap<>();
        String[] nameArr = new String[n + 1];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            map.put(name,i+1); //  도감숫자가 문제긴한데
            nameArr[i+1] = name;
        }
/*
        while(variable-- > 0)입니다.
                여기서 '-- >'가 헷갈릴 수도 있는데요.
        variable--; variable > 0; 이 두 가지를 합쳐놓은 것입니다.
*/
        while(m --> 0) {
            String findStr = br.readLine();
            if(isStringNumber(findStr)) { // 숫자(인덱스)를 입력받은 경우
                int index = Integer.parseInt(findStr);
                sb.append(nameArr[index]);
            }
            else {	// 문자를 입력받은 경우
                sb.append(map.get(findStr));
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }

    // 이 문자열이 숫자인지 아닌지 판단하는 함수
    public static boolean isStringNumber(String s) {
        try {
            Double.parseDouble(s);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
}
