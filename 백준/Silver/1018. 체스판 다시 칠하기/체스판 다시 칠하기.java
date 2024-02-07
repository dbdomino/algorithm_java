import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        String[] arrs= new String[a];
        for (int i = 0; i<a; i++) {
            arrs[i] = br.readLine();
        }

        String[] BlackArr = new String[8];
        for (int i = 0; i<8; i++) {
            if(i % 2 == 0) BlackArr[i] = "BWBWBWBW";
            else BlackArr[i] = "WBWBWBWB";
        }
        String[] WhiteArr = new String[8];
        for (int i = 0; i<8; i++) {
            if(i % 2 == 0) WhiteArr[i] = "WBWBWBWB";
            else WhiteArr[i] = "BWBWBWBW";
        }

        int answer= 64; // 최대로 칠해야한다면 64개가 될것이다.

        for (int i = 0; i < (a-7); i++){
            for(int j = 0; j < (b-7); j++) {
                int Bcount = 0;
                int Wcount = 0;

                for (int k = 0; k<8; k++){
                    for (int l = 0; l<8; l++){ // 블랙먼저시작, 화이트먼저시작 중에 머가 더 칠해야되는 개수가 적은지 비교하기위해
                        if (BlackArr[k].charAt(l) != arrs[i+k].charAt(j+l) ) Bcount++;
                        if (WhiteArr[k].charAt(l) != arrs[i+k].charAt(j+l) ) Wcount++;
                    }
                } // 그중에 최소 칠해야되는수를 찾아 answer에 저장한다.
                answer = Math.min(answer, Math.min(Wcount, Bcount));
//                System.out.println("i= "+i+" , j= "+j + " , answer = "+answer);
            }
        }

        System.out.println(answer);

        br.close();

    }
}
